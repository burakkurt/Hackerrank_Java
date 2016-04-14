package algorithms.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ManasaAndStones {
	
	public static Stone root = null;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testNum = in.nextInt();
		
		for(int i=0;i<testNum;i++){
			int numStones = in.nextInt();
			String a = in.next();
			String b = in.next();
			
			for(int n=0;n<numStones;n++){
				if(root == null){
					root = new Stone();
				}else{

					LinkedList<Stone> queue = findLeafNodes(root);
					for(Stone stone:queue){
						stone.addLeftChild(a);
						stone.addRightChild(b);
					}
				}
				
			}
			
			
		}
		/*
		System.out.println(root.leftChild);
		System.out.println(root.rightChild);
		
		System.out.println(root.leftChild.leftChild);
		System.out.println(root.leftChild.rightChild);
		System.out.println(root.rightChild.leftChild);
		System.out.println(root.rightChild.rightChild);
		

		System.out.println(root.leftChild.rightChild.leftChild);
		System.out.println(root.rightChild.rightChild.rightChild);
		
		System.out.println(findLeafNodes(root));
		*/
		
		
	}
	
	public static LinkedList<Stone> findLeafNodes(Stone node){
		LinkedList<Stone> leafNodes = new LinkedList<Stone>();
		Stone curr = node;
		
		if(curr.leftChild == null && curr.rightChild == null){
			leafNodes.add(curr);
		}else{
			for(Stone stone:findLeafNodes(curr.leftChild))
				leafNodes.addLast(stone);
			for(Stone stone:findLeafNodes(curr.rightChild))
				leafNodes.addLast(stone);
		}
		
		return leafNodes;
	}

}

class Stone{
	
	String prefix = null;
	Stone leftChild = null;
	Stone rightChild = null;
	
	Stone(){
		prefix = "0";
	}
	
	Stone(String parentName, String name){
		prefix = parentName + ", " + name;
	}
	
	public Stone getLeftChild() {
		return leftChild;
	}

	public Stone getRightChild() {
		return rightChild;
	}

	public void addLeftChild(String name){
		leftChild = new Stone(prefix, name);
	}
	
	public void addRightChild(String name){
		rightChild = new Stone(prefix, name);
	}
	
	public String toString(){
		return "prefix : " + prefix + "-";
	}
	
}
