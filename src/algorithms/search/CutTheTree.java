package algorithms.search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class CutTheTree {
	
	private static Node[] nodeArr;
	private static Node root;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("input02.txt");
		Scanner in = new Scanner(file);
		int size = in.nextInt();
		
		nodeArr = new Node[size];
		for(int i=0;i<size;i++){
			nodeArr[i] = new Node(i+1, in.nextInt());
		}
		
		
		int sum=0;
		root = nodeArr[0];
		sum += root.getValue();
		Node curr = root;
		for(int n=0;n<size-1;n++){
			int to = in.nextInt();
			int from = in.nextInt();
			sum += nodeArr[from-1].getValue();
			
			if(to == curr.getId()){
				curr.addChildren(nodeArr[from-1]);
			}
			else{
				Node[] children = curr.getChildren();
				for (Node node : children) {
					if(node != null && to == node.getId()){
						curr = node;
						curr.addChildren(nodeArr[from-1]);
						break;
					}
				}
			}
				
			
		}

		int min = 2000000000;
		for(int k=1;k<nodeArr.length;k++){
			int sumSubNodes = sum(nodeArr[k]);
			int tempMin = Math.abs((sum-sumSubNodes) - sumSubNodes);
			
			if(min > tempMin)
				min = tempMin;
		}
		
		System.out.println(min);
		
	}
	
	public static int sum(Node node){
		int summ = node.getValue();
		Node[] nodeChildren = node.getChildren();
		int numChildren = node.getNumChildren();
		if(numChildren >= 0){
			for (Node node2 : nodeChildren) {
				if(node2 != null)
					summ += sum(node2);
			}
			return summ;
		}
		return node.getValue();
		
	}
	
	public static Node dfs(int searchNumber){
		int sum=0;
		Node curr = root;
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addFirst(curr);
		
		while(queue.size() > 0){
			curr = queue.removeFirst();
			sum += curr.getValue();
			
			if(searchNumber == curr.getId()){
				System.out.println(sum);
				return curr;
			}
			else{
				Node[] children = curr.getChildren();
				for(Node childNode:children)
					if(childNode != null){
						queue.addFirst(childNode);
					}
			}
		}
		
		return null;
	}

}

class Node{
	
	private int id;
	private int value;
	private int numChildren = -1;
	private Node[] children = new Node[100]; 
	
	Node(int id, int value){
		this.id = id;
		this.value = value;
	}
	
	public int getId() {
		return id;
	}
	public int getValue() {
		return value;
	}
	public Node[] getChildren() {
		return children;
	}
	public int getNumChildren() {
		return numChildren;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void addChildren(Node newChild) {
		numChildren++;
		this.children[numChildren] = newChild;
	}
	
	public String toString(){
		String result = "ID: " + id + " Value: " + value + " Children:";
		for(int i=0;i<numChildren;i++)
			result += "[ " + children[i] + " ]";
		
		return result;
	}
	
}
