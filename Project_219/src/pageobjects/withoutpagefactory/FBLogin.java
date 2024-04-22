package pageobjects.withoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBLogin 
{
	WebDriver driver;
	
	public FBLogin(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	public By email=By.xpath("//input[@id='email']");
	public By password=By.xpath("//input[@id='pass']");
	public By Login=By.xpath("//button[@value='1']");
	public By forgotpassword=By.xpath("//a[contains(.,'Forgotten password?')]");
	public By createnewaccount=By.xpath("//a[contains(.,'Create new account')]");
	

	//Verifying login page title
	String exp_title="Facebook – log in or sign up";
	public void verifyfbloginpagetitle()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(ExpectedConditions.titleIs(exp_title));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	String Iemail="Darshan";
	public void enteremail()
	{
		driver.findElement(email).sendKeys(Iemail);
	}
	
	String Ipwd="admin@123";
	public void enterpassword()
	{
		driver.findElement(password).sendKeys(Ipwd);
	}
	
	public void clickloginbutton()
	{
		driver.findElement(Login).click();
	}
	
	public void createnewaccount()
	{
		driver.findElement(createnewaccount).click();
	}
	
	public void userlogin()
	{
		verifyfbloginpagetitle();
		enteremail();
		enterpassword();
		clickloginbutton();
	}
	
	public void userloginwithoutpwd()
	{
		verifyfbloginpagetitle();
		enteremail();
		clickloginbutton();
	}
	
}
