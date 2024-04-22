package pageobjects.withoutpagefactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FB_Reg 
{
	
	WebDriver driver;
	
	public FB_Reg(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public By firstname=By.xpath("//input[@aria-label='First name']");
	public By surname=By.xpath("//input[@name='lastname']");
	public By email=By.xpath("//input[@name='reg_email__']");
	public By DOBday=By.xpath("//select[@id='day']");
	
	public void waitforfirtname()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOfElementLocated(firstname));
			System.out.println("fistname visible at webpage");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  String Ifirstname="Suresh";
	public void enterfirstname()
	{
		driver.findElement(firstname).sendKeys(Ifirstname);
	}
	
	public String ISurname="Kumar";
	public void entersurname()
	{
		driver.findElement(surname).sendKeys(ISurname);
	}
	
	public String IEmail="sureshkumar@gmail.com";
	public void enteremail()
	{
		driver.findElement(email).sendKeys(IEmail);
	}
	
	public String Iday="21";
	public void selectdobday()
	{
		new Select(driver.findElement(DOBday)).selectByVisibleText(Iday);
	}
	
	
	public void userregistration()
	{
		waitforfirtname();
		enterfirstname();
		entersurname();
		enteremail();
		selectdobday();
	}
	
}
