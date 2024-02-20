package bq.java.methods.parameters;

public class Multiple_Parameters 
{
	//Method with single parameter
	public void method1(String EMPID)
	{
		System.out.println(EMPID);
	}
	
	//Method with Multiple Sequence parameters
	public void method2(String UID, String PWD)
	{
		System.out.println(UID);
		System.out.println(PWD);
	}
	
	
	
	//Method with Multiple parameters [With Different Datatype]
	public void method3(String Mobile, int quantity)
	{
		System.out.println(Mobile+"    "+quantity);
	}
	
	
	//Method with Multiple parameters [With Different Datatype]
	public void method3(int quantity,String Mobile)
	{
		System.out.println(quantity+"   "+Mobile);
	}
	
	//Method with Multiple Parameters
	public void productinfo(String Phonename,boolean status,double price,int quantity)
	{
		System.out.println(Phonename+"    "+status+"    "+price+"    "+quantity);
	}
	
	
	public static void main(String[] args)
	{
		
		//Create object to Class
		Multiple_Parameters obj=new Multiple_Parameters();
		obj.method1("001");
		
		//Calling method with multiple arguments
	    obj.method2("admin", "123");
		obj.method3(10, "Iphone");
		obj.method3("Samsung", 1);
		obj.productinfo("OnePlus", true, 25000.00, 3);
		
	}

}
