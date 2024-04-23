package pageobjects.withoutpagefactory.keywords;

import org.openqa.selenium.WebDriver;

import datadriven.Excel.Keywords.Excel;
import pageobjects.withoutpagefactory.FBLogin;
import pageobjects.withoutpagefactory.FB_Reg;

public class TestcasewithKeywords 
{
	WebDriver driver;
	FB_Reg reg;
	FBLogin login;
	PageObject_Keywords keywords;
	
	
	public TestcasewithKeywords(WebDriver driver) 
	{
		this.driver=driver;
		reg=new FB_Reg(driver);
		login=new FBLogin(driver);
		keywords=new PageObject_Keywords(driver);
		
	}
	
	String ExpTitle="Facebook – log in or sign up";
	public void VerifySignupWithValidData()
	{
		Excel.getexcel("InputData.xlsx", "mydata");
		String getusername=Excel.getCellData(1, 0);
		String getsurname=Excel.getCellData(1, 1);
		
		if(keywords.VerifyPageTitle(ExpTitle))
		{
			keywords.ClickElemnet(login.createnewaccount);
			keywords.typetext(reg.firstname, getusername);
			keywords.typetext(reg.surname, getsurname);
		}
		else
			System.out.println("Title not verified");
	}
	
	
	

}
