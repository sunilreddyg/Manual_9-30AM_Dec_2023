package bq.java.loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example {

	public static void main(String[] args) throws Exception {
		
		
		//print numbers 1 to 10 using while loop
		int i=0;
		while(i < 10)
		{
			i=i+1;
			System.out.println(i);
		}
		
		
		//While with false condition
		int j=10;
		while(j < 10)
		{
			System.out.println("Nothing execute here");
		}
		
		
		//Example:--> Manage Explicitwait using While Loop
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/reg");
		driver.manage().window().maximize();
				
				
		WebElement Email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		Email.sendKeys("info@gmail.com");
				
		

		WebElement RetypeEmail = null;
		try {
			RetypeEmail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		int count=0;
		while(!RetypeEmail.isDisplayed())
		{
			
			Thread.sleep(1000);
			count=count+1;
			if(count==30)
			{
				throw new Exception("Run Stopped Because of timeout");
			}
		}
		
		System.out.println("Object is visible at webapge");
		
		

	}

}
