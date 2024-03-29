package bq.java.Arrays;

public class Runtime_Array 
{

	public static void main(String[] args) 
	{
		
		//Simple Dimensional runtime array 
		//Group of String values to store
		String name[]= {"chrome","firefox","edge","ie","safari"};
		String ff=name[1];
		System.out.println(ff);
		
		
		//Print all browser names
		for (int i = 0; i < name.length; i++) 
		{
			System.out.println(name[i]);
		}
		
		
		//Group of integer values to store
		int num[]= {100,200,400,600};
		int val=num[2];
		System.out.println(val);
		
		
		//Differnet Datype values to store in array
		Object obj[]= {"OnePlus",52000,true};
		//Casting object value to String
		String mobile=(String) obj[0];
		System.out.println(mobile);

	}

}
