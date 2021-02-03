package linkedList;

public class SwapNodes {
	Node head;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	
	public void Swap(int x, int y) {
		if(head== null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(x == y) {
			return;
		}
		
		Node prevX = null;
		Node prevY = null;
		
		Node currX = head;
		Node currY = head;
		
		// looping through to find x, and what the node is before it
		while (currX.next != null && currX.data != x) {
			prevX = currX;
			currX= currX.next;
		}
		// looping through to find y, and what the node is before it
		while(currY.next != null && currY.data != y) {
			prevY = currY;
			currY= currY.next;
		}
		
		if (currX.data != x || currY.data !=y) {
			System.out.println("x or y not found");
			return;
		}
		//find if x is the head, and if so make y the head
		if (prevX == null) {
			head = currY;
		} else {
			prevX.next = currY;
		}
		//find if y is the head, and if so make x the head
		if (prevY == null) {
			head = currX;
		} else {
			prevY.next = currX;
		}
		
		// connect x to y.next, and y to x.next
		Node temp = currY.next;
		currY.next = currX.next;
		currX.next = temp;
	}
	
	public void push(int n) {
		
		//if list is empty, make the node the head
		Node nn = new Node(n);
		if( head == null) {
			head = nn;
			return;
		}
		
		// make the prev head the next node in the list, and make the new
		// node the head
		Node m = head;
		head = nn;
		nn.next = m;
	}
	
	//so long as there are nodes connected,print them out in order 
	public void print() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data +" ");
			temp=temp.next;
			}
		System.out.println();
	}

}
