package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList l_dup=new LinkedList();
		l_dup.addAll(l);
		System.out.println(l_dup); //[X, Y, Z, A, B, C]
		
		l_dup.removeAll(l);
		System.out.println("After removing :"+l_dup); //[]
		
		// Sort ---   Collections.sort()
		
		System.out.println("Elements in the linked list:"+l); //[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("Elements in the linked list after sorting:"+l); //[A, B, C, X, Y, Z]

		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Elements in the linked list after sorting in reverse order:"+l); //[Z, Y, X, C, B, A]
		
		//Shuffling - Collections. shuffle()
		
		Collections.shuffle(l);
		System.out.println("Elements in the linked list after Shuffling:"+l); //[A, C, X, B, Y, Z]
		
	}

}
