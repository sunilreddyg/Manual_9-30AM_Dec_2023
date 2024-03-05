package javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Javascript_Type_Text_into_Editbox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Using Selenium Method Type text into editbox
		//driver.findElement(By.id("email")).sendKeys("Darshan");
		
		//Using Keybord Interaction class type text into Editbox
		WebElement Password=driver.findElement(By.id("pass"));
		new Actions(driver).sendKeys(Password, "Hello@123").perform();
		
		//Using javascript Executor type text into editbox
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('email').value='info@gmail.com'");
		
		//Using Javascript executor performing click method
		WebElement Login=driver.findElement(By.xpath("//button[@name='login']"));
		((JavascriptExecutor)driver)
		.executeScript("arguments[0].click()", Login);
		
	}

}
