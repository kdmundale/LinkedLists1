import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Insertion {
	
	public static void main(String[] args) {
		
		System.out.println("Build an array to be insertion sorted.\nEnter numbers one at a time, when finished type done.");
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
		System.out.println("");
		insertionSort(myList);
		System.out.println("");
		printList(myList);
		
		
	}
	
	public static ArrayList<Double> insertionSort(ArrayList<Double> a){
		
		for(int i=0; i<a.size();i++) {
			int j = i+1;
			while (j<a.size()) {
				if(a.get(j)< a.get(i)) {
					a.add(i, a.remove(j));
					j++;
				} else {
					j++;
				}
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
