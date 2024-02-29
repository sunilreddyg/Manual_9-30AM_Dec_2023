package webdriver.interactions.Mouse;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Action 
{
	
		public static void main(String[] args) throws Exception 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			//Use Mouse Right click at location
			WebElement Element=driver.findElement(By.xpath("//span[contains(.,'right click me')]"));
			new Actions(driver).contextClick(Element).perform();
			
			
			//Use Mouse Click action
			WebElement Delete=driver.findElement(By.xpath("//li[contains(.,'Delete')]"));
			new Actions(driver).click(Delete).perform();
			
			//Switch to alert and accept alert   [Switch Commands chapter]
			Thread.sleep(4000);
			driver.switchTo().alert().accept();

		}

	}


