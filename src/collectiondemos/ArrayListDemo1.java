package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//1) declare arraylist
		//ArrayList<Integer> ar=new ArrayList<Integer>();   // only accepts Integers
		//ArrayList<String> ar=new ArrayList<String>();   // only accepts Strings
		//ArrayList al=new ArrayList(); // accepts all data type values
		List al=new ArrayList();
		
		//2) How to add individual values in to arraylist
		al.add(100);
		al.add("welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println(al); 
		
		//3) find size of array list- size()  
		System.out.println(al.size());
		
		//4) remove values from arraylist  - remove()
		al.remove(2); // remove value from 2nd place, here 2 is index, index starts from 0
		System.out.println("After removing:"+al); 
		
		//5) Inserting Element using index
		al.add(2, "Python");
		System.out.println("After insertion :"+al);
		
		//6) How to read specific value
		System.out.println(al.get(2)); //Python here 2 is index
		
		//7) changing the element  
		  al.set(2,"C#");  
		  System.out.println("After setting new value:"+al);
		
		 //8) searching element - contains()
		 System.out.println(al.contains("C#"));
		 
		 //9) isEmpty()
		 System.out.println(al.isEmpty());
		 
		 
		 // Reading ArrayList
		 System.out.println("***** Read all elements from Array List using class loop *****");
		  	for(int i=0;i<al.size();i++)
		  		{
				System.out.println(al.get(i));
		  		}
			
		 	System.out.println("***** Read all elements from Array List using For..each loop *****");
			for(Object value:al)
			{
				System.out.println(value);
			}
			
		 	System.out.println("***** Read all elements from Array List using Iterator *****");
			Iterator itr=al.iterator();//getting the Iterator  
			  while(itr.hasNext())//check if iterator has the elements  
			  {
			   System.out.println(itr.next());//printing the element and move to next  
			  }  
		 
		 
		 
	}

}
