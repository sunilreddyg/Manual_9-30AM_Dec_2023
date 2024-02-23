package implicitwait;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIme_Stamp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9030248855");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9030248855");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(.,'Log in')])[12]")).click();
		
		
		

	}

}
