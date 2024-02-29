package webdriver.AutoCompleteBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggesstions 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Account login
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.cssSelector(".oxd-button")).click();
	    
	    WebElement PIM=driver.findElement(By.cssSelector(".oxd-main-menu-item-wrapper:nth-child(2) .oxd-text"));
	    PIM.click();
	    
	    //Typing referal text into Autocomplete textbox
	    driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("amani");
	    //Selecting One of Suggession from list..
	    driver.findElement(By.xpath("//span[contains(.,'amani  desu')]")).click();


	    driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys("Odis");
	    driver.findElement(By.xpath("//div[@role='option'][contains(.,'Odis  Adalwin')]")).click();
	}

}
