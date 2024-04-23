package pageobjects.HRM.RunPages;

import org.junit.jupiter.api.Test;

import pageobjects.HRM.Keywords.TestBase;
import pageobjects.HRM.Testcases.PIM_Tests;

public class RunPIMTests extends TestBase
{
	
	public RunPIMTests() 
	{
		Setupchrome();
	}
	
	
	@Test
	public void firstest()
	{
		PIM_Tests test=new PIM_Tests(driver);
		test.addingnewemployee();
	}

}
