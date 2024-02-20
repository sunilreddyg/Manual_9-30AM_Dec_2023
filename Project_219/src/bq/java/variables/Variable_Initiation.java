package bq.java.variables;

public class Variable_Initiation 
{

	int a=100;
	
	public void method1()
	{
		a=200;
		System.out.println(a);
	}
	
	public void method2()
	{
		int x=500;
		x=600;
		System.out.println(x);
	}
	
	
	public static void main(String[] args) 
	{
		Variable_Initiation obj=new Variable_Initiation();
		obj.method1();
		obj.method2();

	}

}
