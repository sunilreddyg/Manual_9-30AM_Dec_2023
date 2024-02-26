package webdriver.Editbox;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Sendkeys {

	public static void main(String[] args) throws Exception {
		
		//Browser setup
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement Username=driver.findElement(By.xpath("//input[@autocomplete='username']"));
		Username.sendKeys("sunilreddy.gajjala@outlook.com"+Keys.ENTER);
		
		Thread.sleep(4000);
		
		WebElement Password=driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("Hello@123"+Keys.ENTER);
	}

}
