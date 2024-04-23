package pageobjects.withpagefactory.Example;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class InstaSignup
{

	
	WebDriver driver;
	public InstaSignup(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	@FindBy(xpath = "//input[@name='emailOrPhone']")
	public WebElement  email;
	
	@FindBy(xpath = "//input[@name='fullName']")
	public WebElement  fullname;
	
	@FindBy(xpath = "//input[@name='username']")
	public WebElement  username;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElement  password;

	
	public void waitforsignuppage()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOf(email));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public void enteremail(String ipemail)
	{
		email.sendKeys(ipemail);
	}
	
	public void enterfullnemae(String ipfullname)
	{
		fullname.sendKeys(ipfullname);
	}


}