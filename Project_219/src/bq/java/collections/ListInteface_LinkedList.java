package bq.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListInteface_LinkedList {

	public static void main(String[] args) {
		
		/*
		 * Objects Store into Collection inorder
		 * Accept Duplicate
		 */
		
		List<String> list=new LinkedList<>();
		
		//Adding object to collection at runtime
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("one");
		list.add("four");
		list.add("five");
		
		
		//List allow to get any single object using index number
		String indexobj=list.get(4);
		System.out.println(indexobj);
		
		//Remove object from collection
		list.remove("three");
		
		//Verify object contains at collection
		boolean flag1=list.contains("two");
		System.out.println("Object status is :--> "+flag1);
		
		//Get Object Count of Collection
		int Count=list.size();
		System.out.println("Count is :--> "+Count);
		
		//Clear all data from Collection
		//list.clear();
		
		//Verify Collection is empty
		boolean flag=list.isEmpty();
		System.out.println("Collection Empty ?--"+flag);
		
		//Read First iterator value from collection
		String itr=list.iterator().next();
		System.out.println("First iterator value is :-> "+itr);
		
		
		//Reading list of object using for loop
		for (int i = 0; i <list.size(); i++) 
		{
				String index=list.get(i);
				System.out.println("=>"+index);
		}
		
		
		//Reading all objects from collection using foreach loop
		for (String string : list) 
		{
			System.out.println(string);
		}
		
		
		//Using While loop read collection data
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			String read=iterator.next();
			System.out.println(read);
		}

	}

}
