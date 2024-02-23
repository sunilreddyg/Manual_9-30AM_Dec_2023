package junit;


import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class WebDriverTest 
{
	WebDriver driver;
	
	@BeforeEach  //Invoke every @Test annotation method before
	void setUp() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterEach   //Invoke after each @Test annotated method
	void tearDown() throws Exception 
	{
		Thread.sleep(10000);
		driver.quit();
	}

	@Test
	void test() 
	{
		driver.get("http://instagram.com");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9030248855");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9030248855");
		driver.findElement(By.xpath("(//div[contains(.,'Log in')])[12]")).click();
	}

}
