package bq.java.collections;

import java.util.Hashtable;

public class Map_HashTable 
{

	public static void main(String[] args) 
	{
		
		
		Hashtable<Integer, String> map=new Hashtable<Integer,String>();
		
		//adding object to map
		map.put(100, "Samsung");
		map.put(101, "Iphone");
		map.put(102, "Oneplus");
		map.put(103, "Oppo");
		
		
		//Read Single Pair object Using Key 
		String Phone=map.get(103);
		System.out.println(Phone);
		
		for (Integer key: map.keySet()) 
		{
			String Eachvalue=map.get(key);
			System.out.println(Eachvalue);
		}
		
		
		
	}

}
