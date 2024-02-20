package bq.java.methods.callbyreference;


public class CheckProduct 
{
	
	//Method parameter using call by reference
	public void GetFirstProduct(Product1 obj)
	{
		obj.getProductPrice("iphone");
	}
		
	//Method parameter using call by reference
	public void GetSecondProduct(Product2 obj)
	{
		obj.getProductPrice("Samsung");
	}
	
	
	public static void main(String[] args) 
	{
		CheckProduct obj=new CheckProduct();
		
		//Calling method using callby reference
		Product1 p1=new Product1();
		obj.GetFirstProduct(p1);
		
		//Calling method using callby reference
		Product2 p2=new Product2();
		obj.GetSecondProduct(p2);
		
		
		
		
		
	}

}
