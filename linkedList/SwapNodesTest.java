package linkedList;
import linkedList.SwapNodes.Node;

public class SwapNodesTest {
	
	public static void main(String[] args) {
		
		SwapNodes thing = new SwapNodes();
		
		thing.push(0);
		thing.push(1);
		thing.push(2);
		thing.push(3);
		thing.push(4);
		
		thing.print();
		thing.Swap(3,1);
		thing.print();
	}

}
