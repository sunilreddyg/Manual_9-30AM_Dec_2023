package ui_verificationcommands.Dropdown_Verifications;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_Option_Count 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:--> Verify Month Dropdown contains 12 options
		 */
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		WebElement DOB_month=driver.findElement(By.xpath("//select[@id='month']"));
		//Reading all option tags under select element
		int Count=new Select(DOB_month).getOptions().size();
		//Size is a method it return number options presented at dropdown in integer format
		if(Count==12)
			System.out.println("TestPass");
		else
			System.out.println("Testfail");
		
		
		
	}

}
