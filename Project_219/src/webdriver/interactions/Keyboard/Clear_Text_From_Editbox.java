package webdriver.interactions.Keyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clear_Text_From_Editbox {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement Date=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		new Actions(driver)
		.click(Date)
		.keyDown(Keys.CONTROL)
		.sendKeys("A")
		.pause(2000)
		.sendKeys(Keys.BACK_SPACE)
		.perform();
	}

}
