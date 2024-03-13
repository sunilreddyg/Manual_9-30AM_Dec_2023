package bq.java.operators;



public class Conditional_Operators 
{

	public static void main(String[] args) 
	{
		
		/*
		 * 	Conditional operators
		 * 		== 	Equal to 					x == y 	
		 * 		!= 	Not equal 					x != y 	
		 * 		> 	Greater than 				x > y 	
		 * 		< 	Less than 					x < y 	
         * 		>= 	Greater than or equal to 	x >= y 	
         * 		<= 	Less than or equal to 		x <= y
         * 
         * 	Note:--> All conditional operators return boolean value
		 */
		
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);  //False
		System.out.println(a!=b);  //True
		System.out.println(b>a);   //True
		System.out.println(a<b);   //True
		System.out.println(b<=20); //True
		System.out.println(a>=20); //False
		
		
		//Example1
		if(b>a)
		{
			System.out.println("B is greater than A");
		}
		
		//Example2
		if(a > b)
		{
			System.out.println("A is greater than B");
		}
	
		
		/*
		 * Logical Operators
		 * 		
		 * 		&&  	Logical and 	Returns true if both statements are true 	
		 * 						x < 5 &&  x < 10 	
         *      ||  	Logical or 	    Returns true if one of the statements is true 	
         *      				x < 5 || x < 4 	
         *      ! 	   Logical not 	    Reverse the result, returns false if the result is true 	
         *      				!(x < 5 && x < 10)
		 */
		
		
		int x=10;
		int y=20;
		int z=20;
		
		//Example AND operator
		if(y>x && z>y)
		{
			System.out.println("Y is the middle value");
		}
		
		//Example OR operator
		if(y>x || z>y)
		{
			System.out.println("Condition is ture");
		}
		
		//Example NOT Operator
		if(!(x == 10 && y==29))
		{
			System.out.println("Opposite Condition");
		}
		
	}

}
