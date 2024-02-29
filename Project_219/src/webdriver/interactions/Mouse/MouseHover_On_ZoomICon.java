package webdriver.interactions.Mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_ZoomICon {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window().maximize();
		
		
		//Performing hover action at location
		WebElement Image=driver.findElement(By.xpath("(//a[@class='vlightbox3'])[5]"));
		new Actions(driver)
		.moveToElement(Image)
		.pause(3000)
		.click()
		.perform();

	}

}
