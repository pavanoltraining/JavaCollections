package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	
		PriorityQueue q=new PriorityQueue();
				
		//Adding elements   add()  offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		//q.offer(100); // not allowed in queue( heterogenios data)
		
		System.out.println(q); //[A, B, C, C] //insertion order preserved & duplicates allowed
		
		//get head element    element()   peek()
		//System.out.println(q.element());  //A   Returns Head element  , if empty returns NoSuchElementException
		//System.out.println(q.peek()); //A  Returns Head element,  if empty returns null
		
		
		//Return & remove element from queue   remove()  poll()
		
		//System.out.println(q.remove()); //A
		//System.out.println(q); //[B, C, C]
		
		
		//System.out.println(q.poll()); //A
		//System.out.println(q); //[B, C, C]
		
		
		/*Iterator itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		for(Object ele:q)
		{
			System.out.println(ele);
		}
		
		
		
	}

}
