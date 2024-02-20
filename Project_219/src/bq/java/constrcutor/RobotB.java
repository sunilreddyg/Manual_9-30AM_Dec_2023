package bq.java.constrcutor;


public class RobotB 
{
	//Class Constructor
	public RobotB() 
	{
		System.out.println("PowerOn");
	}
	
	//Reusable method [Instant method]
	public void Walk() 
	{
		System.out.println("Robot is walking");
	}
	
	//Reusable method [Static method / Class method]
	public static void CheckStatus() 
	{
		System.out.println("Status seems good");
	}
	
	
	public static void main(String[] args) 
	{
		//Calling Instantmethod 
		//new ClassName().instantmethodname();
		new RobotB().Walk();
		
		
		//Calling static method 
		// Classname.staticmethodname();
		RobotB.CheckStatus();
		
		
	}

}
