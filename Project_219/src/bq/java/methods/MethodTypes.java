package bq.java.methods;

public class MethodTypes 
{

	//Void method doesn't return any value
	public void method1()
	{
		String name="WebDriver";  //Local variable
	}
	
	/*
	 * => other than void all method types return value
	 * => For other method types we should write return keyword
	 * => return keyword should be writen at end of the method
	 * => Return value should match with method type
	 * => Finally value return to the methodname
	 * 
	 * 
	 */

	//String return method
	public String method2()
	{
		String name="Selenium";  //Local Variable
		return name;
	}
	
	//integer return method
	public int method3()
	{
		return 100;
	}
		
	//Add method
	public int add(int x, int y)
	{
		return x+y;
	}
	
	//boolean return method
	public boolean method4()
	{
		return true;
	}
		
	//double return method
	public double method5()
	{
		return 100;
	}

		
	//double return method
	public char method6()
	{
		return 'A';
	}

	
	
	public static void main(String[] args) 
	{
		
		MethodTypes obj=new MethodTypes();
		obj.method1();
		
		//Calling String return method
		String name=obj.method2();
		System.out.println(name.length());
		
		//Calling integer return method
		int num=obj.method3();
		System.out.println(num);
		
		int total=obj.add(10, 20);
		System.out.println(total+100);
		
		//calling boolean return method
		boolean flag=obj.method4();
		System.out.println(flag);
		
		//Calling double return method
		double price=obj.method5();
		System.out.println(price);
		
		
	}
	

}
