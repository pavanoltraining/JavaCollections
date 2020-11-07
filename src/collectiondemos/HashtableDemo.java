package collectiondemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
	
		//Hashtable t=new Hashtable();  // capacity is 11, load factor 0.75
		//Hashtable t=new(initial capacity);  // create hashtable object with some capacity
		//Hashtable t=new Hashtable(initial capacity, fill ratio/load factor);
		
		Hashtable <Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101,"John");
		t.put(102,"David");
		t.put(103,"Smith");
		//t.put(null,"X"); //NullPointerException
		//t.put(104, null); //NullPointerException
		
		System.out.println(t); //{103=Smith, 102=David, 101=John}
			
		System.out.println(t.get(103)); //Smith
		
		t.remove(103);
		System.out.println(t); //{102=David, 101=John}
		
		System.out.println(t.containsKey(102)); //true
		System.out.println(t.containsKey(105)); //false
		
		System.out.println(t.containsValue("David")); //true
		System.out.println(t.containsValue("Y")); //False
		
		System.out.println(t.isEmpty());//false
		
		System.out.println(t.keySet());  //[102, 101]
		System.out.println(t.values()); //[David, John]
		
		/*for(int k:t.keySet())
		{
			System.out.println(k+"   "+t.get(k));
		}*/
		
		//Entry specific methods...
		
		/*for(Map.Entry entry:t.entrySet())    // (key, value)
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}*/
		
		//iterator()
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();   //(101,x)
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
	}

}




