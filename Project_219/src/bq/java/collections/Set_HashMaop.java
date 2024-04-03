package bq.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Set_HashMaop {

	public static void main(String[] args) 
	{
		
		/*
		 *  It is an unordered collection of objects in which duplicate
		 *   values cannot be stored
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("seven");

		
		//Remove object from collection
		set.remove("three");
		
		//Verify object contains at collection
		boolean flag1=set.contains("three");
		System.out.println("Object status is :--> "+flag1);

		//Get Object Count of Collection
		int Count=set.size();
		System.out.println("Count is :--> "+Count);
		
		//Clear collection
		//set.clear();
		
		//Verify Collection is empty
		boolean flag=set.isEmpty();
		System.out.println("Collection Empty ?--"+flag);
		
		//Read First iterator value from collection
		String itr=set.iterator().next();
		System.out.println("First iterator value is :-> "+itr);
		
		//Read all collection of object using foreach loop
		for (String string : set) 
		{
			System.out.println(string);
		}
		
		//Convert Colletion into iterators
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String str=iterator.next();
			System.out.println(str);
		}
		
	}

}
