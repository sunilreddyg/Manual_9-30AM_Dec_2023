package ui_validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_for_RuntimeObject 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Verify Retype Email is visible after typing valid email
		 */
		
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();    //maximize browser window

		
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.clear();
		Email.sendKeys("info@mindqsystems.com");
		Thread.sleep(4000);
		
		
		WebElement Retype_email=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		if(Retype_email.isDisplayed())
			System.out.println("Retype email is visible at webpage");
		else
			System.out.println("Retype email is not visible at webpage");
		
		
		
	}

}
