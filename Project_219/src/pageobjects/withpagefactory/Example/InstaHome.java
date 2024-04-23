package pageobjects.withpagefactory.Example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstaHome 
{
	WebDriver driver;
	public InstaHome(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath = "(//span[contains(.,'Sign up')])[2]")
	public WebElement Signup;
	
	@FindBy(xpath = "//span[contains(.,'Forgot password?')]")
	public WebElement forgotpassword;
	
	
	public void waitforpage()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(ExpectedConditions.visibilityOf(username));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void clickonsignup()
	{
		Signup.click();
	}
	
	public void clickforgotpassword()
	{
		forgotpassword.click();
	}
	

}
