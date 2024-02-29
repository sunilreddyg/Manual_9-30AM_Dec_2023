package webdriver.interactions.Mouse;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_At_Location {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Moving mouse cursor to required location
		WebElement Jobs=driver.findElement(By.xpath("(//div[contains(.,'Jobs')])[4]"));
		new Actions(driver).moveToElement(Jobs).perform();
		
		WebElement RemoteJobs=driver.findElement(By.xpath("(//div[contains(.,'Remote jobs')])[5]"));
		//RemoteJobs.click();   //Perform Left Click
		new Actions(driver).click(RemoteJobs).perform();
		
		

	}

}
