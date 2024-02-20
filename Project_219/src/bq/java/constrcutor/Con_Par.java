package bq.java.constrcutor;


public class Con_Par 
{
	
	//Constructor without parameter
	public Con_Par() 
	{
		
	}
	
	//Constructor with single parameter
	public Con_Par(int x) 
	{
		System.out.println(x);
	}
	
	//Constructor with multiple parameter
	public Con_Par(String name,double price) 
	{
		System.out.println(name+"  "+price);
	}
	
	public static void main(String[] args) 
	{
		new Con_Par();
		new Con_Par(10);
		new Con_Par("Oppo", 34999);
		
		
		
	
	}


}
