package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_For_url {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebElement Forgot=driver.findElement(By.linkText("Forgot your password?"));
		Forgot.click();
		
		boolean flag=false;
		try {
			flag=new WebDriverWait(driver, Duration.ofSeconds(50))
			.until(ExpectedConditions.urlContains("requestPasswordResetCode"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(flag)
			System.out.println("Url Verified");
		else
			System.out.println("url Not Verified");
		

	}

}
