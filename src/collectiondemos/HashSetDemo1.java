package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
	
		
		HashSet hs=new HashSet(); // default capacity 16 Load Factor: 0.75
		//HashSet hs=new HashSet(100); // capacity 100 Load Factor 0.75
		//HashSet hs=new HashSet(10, (float) 0.90);
		//HashMap hs=new HashMap(C);
		//HashSet<Integer> evenNumber = new HashSet<Integer>();
		
		
		//Add elements into linked list
			hs.add(100);
			hs.add("welcome");
			hs.add(15.5);
			hs.add('A');
			hs.add(true);
			hs.add(null);
		
		System.out.println(hs); //insertion order NOT Preserved
			
		System.out.println(hs.size()); //6
		
		//remove
		hs.remove(15.5); //value  
		System.out.println("After removing , new set:"+hs);
				
		//Retrieving value/object - Not possible to retrieve specific value
		//System.out.println(hs.get());//incorrect
		
		//change the value - Not possible
		//hs.set(index, "X"); //incorrect
		
		//contains() - searching
		System.out.println(hs.contains("welcome")); // true
		System.out.println(hs.contains("Python")); // false
		
		//isEmpty()
		System.out.println(hs.isEmpty()); //false

		
		//Reading elements from LL using for loop // No Index so not possible
		/*for(int i=0;i<l.size();i++)  
		 {
			System.out.println(l.get(i));
			}*/
				
		//Reading elements from LL using for..each loop
			for(Object e:hs)
			{
				System.out.println(e);
			}
				
		// iterator() method
		Iterator it=hs.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
					
				}
				
	}

}
