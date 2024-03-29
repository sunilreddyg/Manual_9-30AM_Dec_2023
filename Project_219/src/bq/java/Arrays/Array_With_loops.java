package bq.java.Arrays;

public class Array_With_loops {

	public static void main(String[] args) {
	
		
		String name[]= {"chrome","firefox","edge","ie","safari"};

		
		//Using for loop
		for (int i = 0; i < name.length; i++) 
		{
			System.out.println(name[i]);
		}
		
		//Using foreach loop [Recomended for arrays and Collections]
		for (String string : name) 
		{
			System.out.println(string);
		}
		
	}

}
