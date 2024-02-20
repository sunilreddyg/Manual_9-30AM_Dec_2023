package bq.java.methods.staticmethods;

public class CallingFunctions 
{	
	//Instant method
	public void method1() 
	{
		System.out.println("Method1 Executed");
		//Calling Static method At Instant method
		method2();
		//Note:--> Static method can call At instant method
		//Without object Creation
	}
	
	//static method
	public static void method2() 
	{
		System.out.println("Method2 Executed");
		//Calling Instant method At Static method
		new CallingFunctions().method1();
		//Instant method to Call at Static Method 
		//Object Creation is Mandatory
	}
	
	

}
