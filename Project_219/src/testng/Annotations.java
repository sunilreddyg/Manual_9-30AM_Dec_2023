package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Annotations 
{
  @Test  //Invoke method to run without object creation..
  public void Test1() 
  {
	  Reporter.log("Test1 Executed ",true);
  }
  
  @BeforeMethod //invoke before each @Test annotation
  public void beforeMethod() 
  {
	  System.out.println("Test Precondition");
  }
  

  @AfterMethod  //Invoke after each @Test annotation
  public void afterMethod() 
  {
	  System.out.println("Test Postcondition");
  }

  @BeforeClass  //Invoke before first @Test annotation
  public void beforeClass() 
  {
	 System.out.println("Class PreCondition");
  }

  @AfterClass    //Invoke after last @Test annoation
  public void afterClass() 
  {
	  System.out.println("Class PostCondition");
  }
  
  

}
