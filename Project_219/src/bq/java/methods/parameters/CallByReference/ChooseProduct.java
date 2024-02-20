package bq.java.methods.parameters.CallByReference;

public class ChooseProduct 
{
	
	public Book1 selectFirstBook()
	{
		return new Book1();
	}
	
	public Book2 selectSecondBook()
	{
		return new Book2();
	}
	
	
	public static void main(String[] args)
	{
		
		ChooseProduct product=new ChooseProduct();
		
		//PrintDetails is void method
		product.selectFirstBook().printDetails();
		
		double price=product.selectFirstBook().getPrice();
		System.out.println(price);
		
		double price2=product.selectSecondBook().GetPrice();
		System.out.println(price2);
		
		
		product.selectFirstBook().get().finaldiscount();
		
		
	}
	
}
