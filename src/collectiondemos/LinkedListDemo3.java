package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println("Elements in Linked list:"+l);
		
		l.addFirst("Tiger");
		l.addLast("Lion");
		
		System.out.println("After adding First & Last Elements:"+l);

		System.out.println(l.getFirst());  // Get first element
		System.out.println(l.getLast());  // get last element
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing First & Last Elements:"+l);
		
	}

}
