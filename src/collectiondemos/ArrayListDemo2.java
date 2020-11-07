package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
	ArrayList al=new ArrayList(); // accepts all data type values
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		//Add elements of an array list to another array list - addAll()
		ArrayList al_dup=new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup); 

		//Remove group of elements frm the array - removeAll()
		al_dup.removeAll(al);
		System.out.println("After removing group of elements :"+al_dup); 
		
		//Sorting  - sort()
		System.out.println("Before sorting:"+al); 
		Collections.sort(al);
		System.out.println("After sorting:"+al); 
				
		//Sorting - Reverse Order
		Collections.sort(al, Collections.reverseOrder());
		System.out.println("Reverse order:"+al); 
				
		//Shuffling
		Collections.shuffle(al);
		System.out.println("After shuffling:"+al); 
				
	}

}
