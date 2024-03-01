package webdriver.interactions.Mouse.scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_To_Element {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		  //Bring element to view port
		   WebElement BackToTop=driver.findElement(By.xpath("//span[contains(.,'Back to top')]"));
		   new Actions(driver).scrollToElement(BackToTop).perform();
		   
		   
		   WebElement SignInBtn=driver.findElement(By.xpath("(//span[contains(.,'Sign in')])[3]"));
		   SignInBtn.click();
		   
		   //By default scroll object to downside of the page

	}

}
