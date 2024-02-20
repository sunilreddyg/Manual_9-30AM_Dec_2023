package bq.java.methods.staticmethods;

public class Run_MouseMethods 
{
	
	public void method1()
	{
		//Calling instance methods from different class
		new Mouse().active();
	}

	public static void main(String[] args) 
	{
			
		//Calling Static methods From different class
		//We Must Add Class Name Before methodname
		Mouse.LeftClick();
		Mouse.RightClick();
		Mouse.MiddleClick();
		
		//Calling instant method
		new Run_MouseMethods().method1();

	}

}
