package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("email")).sendKeys("darshan");
		driver.findElement(By.id("pass")).sendKeys("Hello@123");
		driver.findElement(By.name("login")).click();
		
	}

}
