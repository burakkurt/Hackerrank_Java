package _30DaysOfCode;

public class Day15_LinkedList {

	public static void main(String[] args) {
		
	}

}

/* Necessary method
 *  
   public static  Node insert(Node head,int data){
        
        if(head == null){
            head = new Node(data);
            return head;
        }   

        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        
        tempNode.next = new Node(data);
        
        return head;
	}
*/