package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporting 
{
	
	
	@Test
	public void tc001()
	{
		//Only Report at Emailable report html file
		Reporter.log("Tc001 Executed");
	}
	
	@Test
	public void tc002()
	{
		//Only Report at Emailable report html file
		//Report at console as well
		Reporter.log("Tc002 Executed",true);
	}
	
	

}
