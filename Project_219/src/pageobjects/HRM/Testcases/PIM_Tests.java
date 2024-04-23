package pageobjects.HRM.Testcases;

import org.openqa.selenium.WebDriver;

import pageobjects.HRM.Keywords.Common_Reusable_actions;
import pageobjects.HRM.Pages.HomePageHRM;
import pageobjects.HRM.Pages.MenuTabs;
import pageobjects.HRM.Pages.PIM_AddEmployee;


public class PIM_Tests 
{
	WebDriver driver;
	Common_Reusable_actions keywords;
	HomePageHRM home;
	MenuTabs tabs;
	PIM_AddEmployee addemployee;
	
	public PIM_Tests(WebDriver driver) 
	{
		this.driver=driver;
		keywords=new Common_Reusable_actions(driver);
		home=new HomePageHRM(driver);
		tabs=new MenuTabs(driver);
		addemployee=new PIM_AddEmployee(driver);

	}
	
	
	//Testcase add employee details
	public void addingnewemployee()
	{
		home.userlogin("Admin", "admin123");
		tabs.clickpimtab();
		addemployee.AddNewEmplyeeDetails("ABCE", "EFGE", "XYZ", "12123");
		keywords.CaptureScreen("addemployee success msg");
	}
	
}
