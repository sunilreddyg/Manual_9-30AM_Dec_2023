package bq.java.conditions;

public class NestedIf_Condition 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Nestedif:-->
		 * 			Child Condition inside parent Condition.
		 */
		
		int age=10;
		boolean healthCheckup_Completed=true;
		
		
		if(age > 1)
		{
		
			//Nested if Condition
			if(healthCheckup_Completed)
			{
				System.out.println("Insurance Accepted");
			}
			else
			{
				System.out.println("Insurance Rejected");
			}
		}
		else
		{
			System.out.println("Age Rejection");
		}
		
		

	}

}
