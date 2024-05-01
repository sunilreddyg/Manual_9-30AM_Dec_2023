package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng_Assertions 
{
	//Create object for SoftAssertion in Testng
	SoftAssert verify=new SoftAssert();
	
	
	@Test
	public void CheckingSoftAssertion()
	{
		verify.assertEquals(20, 30);
		Reporter.log("Test Verified");
		verify.assertAll();
		
		
		// the asserts used till now will not throw any exception if they fail. The @Test will not fail either. 
        // If you need the test method to fail at the end, showing all exceptions, you need to use assertAll()
	}
	
	
	@Test
	public void tc001()
	{
		Assert.assertEquals("Gmail", "Instagram");
		Reporter.log("Instagram Title is Verified");
	}
	
	@Test
	public void tc002()
	{
		Assert.assertEquals("Gmail", "Gmail");
		Reporter.log("Gmail Title is Verified");
	}
	
	@Test
	public void tc003()
	{
		Assert.assertTrue(true);
		Reporter.log("Gmail Title is Verified");
	}
	
	@Test
	public void tc004()
	{
		Assert.assertEquals(100, 100);
		Reporter.log("ID matching");
	}
	
	@Test
	public void tc005()
	{
		Assert.assertFalse(10 > 21);
		Reporter.log("False Condition");
	}
	
}
