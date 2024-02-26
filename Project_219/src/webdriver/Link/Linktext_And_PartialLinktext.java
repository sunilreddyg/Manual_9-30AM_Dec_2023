package webdriver.Link;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_And_PartialLinktext {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Identifying link using linktext locator [Using Original linkname]
		driver.findElement(By.linkText("Locations")).click();

		driver.findElement(By.linkText("India")).click();
		
		driver.findElement(By.linkText("Delhi")).click();
		
		
		//Identifying link using Partialinktext locator [Using Partial linkname]
		driver.findElement(By.partialLinkText("Heart of India")).click();
	}

}
