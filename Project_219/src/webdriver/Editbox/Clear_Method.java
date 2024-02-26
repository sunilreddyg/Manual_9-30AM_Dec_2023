package webdriver.Editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear_Method 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("user1");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Sunil");
		
		/*
		 * Clear:--> Method clear existing text at entrybox
		 * 		Note:--> Dont' use clear method for any objects
		 * 				 otherthan entrybox	
		 */
		
	}

}
