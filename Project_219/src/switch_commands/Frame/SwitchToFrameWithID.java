package switch_commands.Frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameWithID {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("https://support.orangehrm.com/portal/en/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    driver.switchTo().frame("iamFrame");
	    
	    WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
	    email.sendKeys("info@sample.com");
	    
	    //Switch Controls back to frame
	    driver.switchTo().defaultContent();
	    
	    WebElement forgotpassword=driver.findElement(By.xpath("//a[@data-id='reset_pwd']"));
	    forgotpassword.click();

	}

}
