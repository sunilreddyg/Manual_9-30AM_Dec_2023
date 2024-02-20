package bq.java.constrcutor;


public class Change_Gear 
{
	//Constructor at visible state
	public Change_Gear() 
	{
		System.out.println("Hold clutch");
	}
	
	//Instant method
	public void first_gear() 
	{
		System.out.println("First Gear");
	}
	
	//Instant method
	public void second_gear() 
	{
		System.out.println("Second Gear");
	}
	
	//Instant method
	public void third_gear()
	{
		System.out.println("Third Gear");
	}
	
	public static void main(String[] args) 
	{
		new Change_Gear();
		new Change_Gear().first_gear();
		new Change_Gear().second_gear();
		new Change_Gear().third_gear();
		
		
		/*
		 * =>Stroring Class Constructor into Class Reference
		 * => Using class Reference calling instant methods
		 * 
		 */
		Change_Gear obj=new Change_Gear();
		obj.first_gear();
		obj.second_gear();
		obj.third_gear();
		
	}
	
}
