package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait 
{
	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	
		//Set implicitwait command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		long starttime=System.currentTimeMillis();
	
		try {
			driver.findElement(By.id("email@123"));
			System.out.println("Object is Found");
			System.out.println(System.currentTimeMillis()-starttime);
			
		} catch (Exception e) {
			System.out.println("Object Not found");
			System.out.println(System.currentTimeMillis()-starttime);
		}
	
	
	
	
		//Page Load timeout [Wait until all pageobjects to load at webpage]
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		
		//Script Load time [Wait until asynchronized script to load]
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
	
	
	
	
	
	

	}

}
