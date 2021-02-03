import java.util.LinkedList;

public class LinkedListExercises {
	
	public static void main(String[] args) {
//		
//		Linked myList = new Linked();
//		
//		myList.push(1);
//		myList.push(2);
//		myList.push(3);
//		myList.push(4);
//		myList.push(5);
//		
//		myList.printList();
//		

	}
	
	private static ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	class Linked {
		
		ListNode head;
	
		public void printList() { 
			ListNode tNode = head; 
	        while (tNode != null) 
	        { 
	            System.out.print(tNode.data+" "); 
	            tNode = tNode.next; 
	        } 
	    }
		
		public void push(int new_data){ 
	        /* 1. alloc the Node and put the data */
	        ListNode new_Node = new ListNode(new_data); 
	  
	        /* 2. Make next of new Node as head */
	        new_Node.next = head; 
	  
	        /* 3. Move the head to point to new Node */
	        head = new_Node; 
	    } 
	  
		
		public void switchNodes(int a, int b){  
			
			if(a == b) {
				return;
			}
			
			 // Search for x (keep track of prevX and CurrX) 
	        ListNode prevA = null, currA = head; 
	        while (currA != null && currA.data != a) 
	        { 
	            prevA = currA; 
	            currA = currA.next; 
	        } 
	        
	        // Search for y (keep track of prevY and currY) 
	        ListNode prevB = null, currB = head; 
	        while (currB != null && currB.data != b) 
	        { 
	            prevB = currB; 
	            currB = currB.next; 
	        } 
	        
	     // If either a or b is not present, nothing to do 
	        if (currA == null || currB == null) 
	            return; 
	  
	        // If a is not head of linked list 
	        if (prevA != null) 
	            prevA.next = currB; 
	        else //make b the new head 
	            head = currB; 
	  
	        // If b is not head of linked list 
	        if (prevB != null) 
	            prevB.next = currA; 
	        else // make a the new head 
	            head = currA; 
	        
	        ListNode temp = currA.next; 
	        currA.next = currB.next; 
	        currB.next = temp; 	
			
	}
	
	}

}
