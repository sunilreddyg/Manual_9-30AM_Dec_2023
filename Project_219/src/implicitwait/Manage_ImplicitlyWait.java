package implicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_ImplicitlyWait 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9030248855");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9030248855");
		driver.findElement(By.xpath("(//div[contains(.,'Log in')])[12]")).click();
	}

}
