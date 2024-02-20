package bq.java.constrcutor;

public class Calculator 
{
	//Global variables
	int a;
	int b;

	//Constructor
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
	}

	//Instant method
	public void add()
	{
		System.out.println(a+b);
	}
	
	//Instant method
	public void mul()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		
		new Calculator(10, 20).add();
		new Calculator(2, 20).mul();
	}

}
