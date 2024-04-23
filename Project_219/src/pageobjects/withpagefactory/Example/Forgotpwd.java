package pageobjects.withpagefactory.Example;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Forgotpwd
{
	
	WebDriver driver;
	public Forgotpwd(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	


	@FindBy(xpath = "//input[@name='cppEmailOrUsername']")
	public WebElement  email;
	
	@FindBy(xpath = "(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh xdj266r x1yztbdb x7i73kt x14n70j1 x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'])[4]")
	public WebElement  resendlink;
	
	@FindBy(xpath = "(//span[@dir='auto'])[3]")
	public WebElement  cantresetpwd;
	
	@FindBy(xpath = "//a[@href='/accounts/emailsignup/']")
	public WebElement  createNewAccount;
	
	@FindBy(xpath = "//a[contains(@href,'password')]")
	public WebElement  backToLogin;

	
	public void waitforfogotaccountpage()
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
}