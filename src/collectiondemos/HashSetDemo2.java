package collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> evenNumber = new HashSet<Integer>();
		
		//addAll()
		
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
        
       //removeAll()
        numbers.removeAll(evenNumber);
        System.out.println("New HashSet: " + numbers);
	}

}
