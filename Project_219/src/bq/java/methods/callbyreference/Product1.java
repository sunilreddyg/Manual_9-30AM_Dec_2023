package bq.java.methods.callbyreference;

public class Product1 
{
	double price=25000.00;
	
	//Method parameter using callbyvalue
	void getProductPrice(String Name)
	{
		System.out.println(Name+"    "+price);
	}

}
