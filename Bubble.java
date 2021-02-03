import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args) {
		System.out.println("Build an array to be sorted.\nEnter numbers one at a time, when finished type done.");
		boolean build = true;
		
		ArrayList<Double> myList = new ArrayList<Double>();
		
		while(build = true) {
			Scanner in= new Scanner(System.in);
			String input = in.nextLine();
			try {
				   double x = Double.parseDouble(input); 
				   
				 } catch (NumberFormatException e) {
				   build = false;
				   break;
				 } 
			 double x = Double.parseDouble(input); 
			 myList.add(x);
		}
		
		printList(myList);
		
		for (int j = 0; j < myList.size(); j++) {
			bubbleSort(myList);
		}
		
        System.out.println("");
        printList(myList);
        
	}
	
	public Bubble() {
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Double> bubbleSort(ArrayList<Double> a) {
		
		for (int i=0; i < a.size() - 1; i++) {
			double n = (double) a.get(i);
			double m = (double) a.get(i+1);
			if (n > m) {
				a.set(i, m);
				a.set((i+1), n);
			}
		}
		return a;
		
	}
	
	public static void printList(ArrayList<Double> a) {
		Iterator<Double> it = a.iterator(); 
        while (it.hasNext())
            System.out.print(it.next() + " ");
	}

}
