package bq.java.variables;

public class VariableTypes 
{
	public int a=100;  					//Global variable  [Instant Variable]
	public static boolean flag=true;    //Global Variable [Class Variable]
	
	public void method1() 
	{
		String name="webdriver";    //Local variable
		System.out.println("local variable "+name);
		System.out.println("Global variable:--> "+a);
	}
	
	public void method2()
	{
		System.out.println("Global variable:--> "+a);
	}
	
	public static void main(String[] args) 
	{
		//Calling Instant methods
		//new Classname().methodname();
		new VariableTypes().method1();
		new VariableTypes().method2();
		
		//Call Instant Variable
		int x=new VariableTypes().a;
		System.out.println(x);
		
		//Calling static variable
		boolean status=VariableTypes.flag;
		System.out.println(status);
	}

}
