package webdriver.Editbox;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Syntax_Example {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		WebElement Firstname=driver.findElement(By.name("firstname"));
		Firstname.sendKeys("Ajay"+Keys.TAB
				+"Krishna"+Keys.TAB
				+"9030248855"+Keys.TAB
				+"admin@123");
		
		
		Thread.sleep(2000);
		
		
		//Selecting dropdown option using Keboard keys
		driver.findElement(By.id("day")).sendKeys("24");
		
		//Selecting dropdown option using arrow keys
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		//Selecting Radio button using keyboard shortcut
		driver.findElement(By.xpath("(//input[@type='radio'])[2]"))
		.sendKeys(Keys.SPACE);
		
		
		/*
		 * Note:-->
		 * 		For dropdown selection and checkbox and radio button
		 * 		selection selenium have separate commands..
		 */
		
		
	}

}
