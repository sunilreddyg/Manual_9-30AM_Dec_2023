package testng;

import org.testng.annotations.Test;

public class InvaCation_Count

{
	
  int count=0;
  @Test(invocationCount=10)
  public void test() 
  {
	  System.out.println("Test Executed");
	  count=count+1;
	  System.out.println(count);
  }
  
  
}
