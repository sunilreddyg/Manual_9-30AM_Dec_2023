package ui_verificationcommands;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageUrl {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		try {
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Browser is UP");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		
		if(driver!=null)
		{
			
				try {
					driver.get("https://opensource-demo.orangehrmlive.com/web/");
					System.out.println("Page load successfull");
				} catch (SessionNotCreatedException e) {
					e.printStackTrace();
					System.out.println("Browser version is mismatched");
				} catch (InvalidArgumentException e) {
					e.printStackTrace();
					System.out.println("invalid url format");
				}
				
				WebElement ForgotPassword=driver.findElement(By.xpath("//p[contains(.,'Forgot your password?')]"));
				ForgotPassword.click();
				
				String Exp_url="auth/requestPasswordResetCode";
				String Exp_title="OrangeHRM";
				
			
				String ActUrl=driver.getCurrentUrl();
				String ActTitle=driver.getTitle();
				
				Assert.assertEquals(Exp_title, ActTitle);
				
				if(ActUrl.contains(Exp_url) && ActTitle.equals(Exp_title))
				{
					System.out.println("Expected title and url presented");
				}
				else
				{
					System.out.println("Title or Url is mismatched");
				}
		}
		else
		{
			System.out.println("Browser launch Failed");
		}
		

	}

}
