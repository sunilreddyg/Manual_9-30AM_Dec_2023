package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_PageTitle 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.titleIs("Facebook – log in or sign up"));
		System.out.println("Facebook Title is verified");
		
		WebElement forgotpassword=driver.findElement(By.linkText("Forgotten password?"));
		forgotpassword.click();
		
		
		try {
			wait.until(ExpectedConditions.titleContains("Password"));
			System.out.println("Forgotten Password title verified");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
