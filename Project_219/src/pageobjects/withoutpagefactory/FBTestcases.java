package pageobjects.withoutpagefactory;

import org.openqa.selenium.WebDriver;

public class FBTestcases 
{
	WebDriver driver;
	FB_Reg reg;
	FBLogin login;
	
	public FBTestcases(WebDriver driver) 
	{
		this.driver=driver;
		reg=new FB_Reg(driver);
		login=new FBLogin(driver);
	}
	
	public void tc001_userregistration()
	{
		login.createnewaccount();
		reg.waitforfirtname();
		reg.userregistration();
	}
	
	
	
	
}
