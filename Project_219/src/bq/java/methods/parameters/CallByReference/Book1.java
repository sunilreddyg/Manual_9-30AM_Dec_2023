package bq.java.methods.parameters.CallByReference;

public class Book1 
{
	//Global variables
	String name="Java";
	double price=1500.00;
	
	public void printDetails()
	{
		System.out.println("BookName is ---> "+name);
		System.out.print("Book Price is ---> "+price);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	public Discount get()
	{
		return new Discount();
	}
	
	

}
