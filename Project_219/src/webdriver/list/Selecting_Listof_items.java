package webdriver.list;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Listof_items 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//First Click to Open List of Options
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(2000);
		
		//Second click to select one of option from list
		WebElement EMI=driver.findElement(By.xpath("//li[@value='5'][contains(.,'EMI')]"));
		EMI.click();
	
		/*
		 * Note:--> No Separate method available for list of items to 
		 * 			select. But We can manage list of item selection 
		 * 			using click method.
		 */
		
		
	}

}
