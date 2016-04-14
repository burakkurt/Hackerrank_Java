package algorithms.graph_theory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


//ÇÖZÜLEMEDİ
public class EvenTree {
	
	private Node root;
	private int size;
	
	public void addNode(Node newNode){
		
		if(root == null){
			root = newNode;
			size += 2;
		}else{
			List<Node> queue = new LinkedList<Node>();
			queue.add(root);
			Node removedNode = null;
			
			while(queue.size() > 0){
				
				removedNode = queue.remove(0);
				if(removedNode.getNumber() == newNode.getNumber()){
					removedNode.addChildren((int) newNode.getKeySet().toArray()[0]);
					size++;
				}
				else{
					Set<Integer> keyArr = removedNode.getKeySet();
					for (Integer number : keyArr) {
						queue.add( removedNode.getSpecChild(number) );
					}
				}
				
			}
			
		}
		
	}
	
	public int trimTree(Node root){
		Node curr = root;
		List<Node> queue = new LinkedList<Node>();
		int totalNodeValue = 0;		
		
		for (Integer childKey : curr.getKeySet()) {
			queue.add( curr.getSpecChild(childKey) );
		}
		
		while(queue.size() > 0){
			curr = queue.remove(0);
			totalNodeValue += curr.getNumber();
			
			for (Integer childKey : curr.getKeySet()) {
				queue.add( curr.getSpecChild(childKey) );
			}
		}
		
		if(totalNodeValue %2 == 0){
			System.out.println(totalNodeValue);
			return 1;
		}
		else
			return 0;
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		EvenTree evenTree = new EvenTree();
		File file = new File("input22.txt");
		Scanner in = new Scanner(file);
		in.next();
		int numAddNode = in.nextInt();
		
		for(int i=0;i<numAddNode;i++){
			evenTree.addNode(new Node(in.nextInt(), in.nextInt()));
		}
		
		
		
		List<Node> queue = new LinkedList<Node>();
		queue.add(evenTree.root);
		Node removedNode = null;
		int total = 0;
		
		while(queue.size() > 0){
			
			removedNode = queue.remove(0);
			Set<Integer> keyArr = removedNode.getKeySet();
			
			if(keyArr.size() > 0)
				total += evenTree.trimTree(removedNode);
			
			for (Integer number : keyArr) {
				queue.add( removedNode.getSpecChild(number) );
			}
			
			
		}
		
		
		System.out.println(total);
	}

}

class Node{
	
	private int number;
	private Map<Integer, Node> children = null; 
	
	Node(int number){
		children = new HashMap<Integer, Node>();
		this.number = number;
	}
	
	Node(int childrenName, int number){
		children = new HashMap<Integer, Node>();
		this.number = number;
		this.children.put(childrenName, new Node(childrenName));
	}

	public int getNumber() {
		return number;
	}
	
	public Node getSpecChild(int number){
		return children.get(number);
	}
	
	public Set<Integer> getKeySet(){
		return children.keySet();
	}

	public void addChildren(int number){
		children.put(number, new Node(number));
	}
	
	public String toString(){
		return "Node number: " + this.getNumber() + "\n" + "Children : " + this.getKeySet();
	}
	
}
