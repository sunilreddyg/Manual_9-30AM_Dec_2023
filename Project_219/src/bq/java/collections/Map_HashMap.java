package bq.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_HashMap 
{

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		
		//adding object to map
		map.put(100, "Samsung");
		map.put(101, "Iphone");
		map.put(null, "Oneplus");
		map.put(103, "Oppo");
		map.put(104, null);
		map.put(105, null);
		map.put(106, "Vivo");
		
		
		
	
		
		
		
		
		//Read Single Pair object Using Key 
		String Phone=map.get(106);
		System.out.println(Phone);
		
		//Using Keyset reading all values
		Set<Integer> set=map.keySet();
		for (Integer eachkey : set) 
		{
			String value=map.get(eachkey);
			System.out.println(value);
		}
		
		

	}

}
