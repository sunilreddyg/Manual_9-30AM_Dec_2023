package bq.java.methods.staticmethods;

public class Mouse 
{
	
	//Instant method
	public void active() 
	{
		System.out.println("Mouse is active");
	}
	
	//Static method
	public static void LeftClick() 
	{
		System.out.println("Left click performed");
	}
	
	//Static method
	public static void RightClick() 
	{
		System.out.println("Right click performed");
	}
		
		
	//Static method
	public static void MiddleClick() 
	{
		System.out.println("Middle click performed");
	}
	
	

	public static void main(String[] args) 
	{
		//Calling Instant mehtod
		//Syntax:->   new Classname().methodname();
		new Mouse().active();
		
		//Calling Static method
		//Syntax:-->   Classname.methodname();
		//To call static method with in class  no need of Classname
		LeftClick();
		MiddleClick();
		RightClick();

	}

}
