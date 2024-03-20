package ui_verificationcommands.getText;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Text_presented_At_location {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Scenario:  Verify Email validation using blank
		 * 		Given site url is "https://login.live.com/login.srf?"
		 * 		When User Click Next Button without Enter Email
		 * 		Then verify Error message displayed "Enter a valid email address, phone number, or Skype name."
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.live.com/login.srf?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//Sending blank text to email editbox
		WebElement Email=driver.findElement(By.xpath("//input[@id='i0116']"));
		Email.sendKeys("");
		
		WebElement Next_btn=driver.findElement(By.xpath("//button[@id='idSIButton9']"));
		Next_btn.click();
		Thread.sleep(3000);
		
		try {
			
			 WebElement ErrorLocation=driver.findElement(By.xpath("//div[@id='i0116Error']"));
			 String ErrorText=ErrorLocation.getText();
			 System.out.println(ErrorText);
			 
			 String ExpText="Enter a valid email address, phone number, or Skype name.";
			 if(ErrorText.equals(ExpText))
				 System.out.println("Testpass");
			 else
				 System.out.println("Testfail");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
