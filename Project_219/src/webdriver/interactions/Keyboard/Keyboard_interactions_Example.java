package webdriver.interactions.Keyboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_interactions_Example {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(20000);
		
		WebElement FromLabel=driver.findElement(By.xpath("//span[contains(.,'From')]"));
		new Actions(driver).click(FromLabel)
		.pause(2000).sendKeys("DEl")
		.pause(2000).sendKeys(Keys.ARROW_DOWN)
		.pause(2000).sendKeys(Keys.ENTER).perform();
		
		
		WebElement To=driver.findElement(By.xpath("(//span[contains(.,'To')])[1]"));
		new Actions(driver).click(To).pause(2000).sendKeys("BLR").perform();
		
		WebElement City=driver.findElement(By.xpath("(//p[contains(.,'Bengaluru, India')])[1]"));
		new Actions(driver).click(City).perform();

		

		
		
		
		
		
		
	}

}
