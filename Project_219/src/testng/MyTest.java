package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest 
{
  
  @Test
  public void tc001() 
  {
	  Reporter.log("First Test executed");
  }
  
  @Test
  public void tc002() 
  {
	  Reporter.log("Second Test executed");
  }
  
  
  @Test
  public void tc003() 
  {
	  Reporter.log("third Test executed");
  }
  
  
  
}
