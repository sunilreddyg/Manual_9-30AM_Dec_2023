package bq.java.loops;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_while {

	public static void main(String[] args) throws Exception {
		
		
		//Do while false Condition
		int i=10;
		do {
			System.out.println(i);
		} while (i<0);
		
		
		//Do-while using true condtion
		int j=0;
		do {
			j=j+1;
			System.out.println(j);
		} while (j<10);
		
		
		//Reload webpage until Required title presented
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		boolean flag=false;
		int count=0;
		do {
			
			Thread.sleep(1000);
			driver.get("http://instagram.com");
			
			try {
				flag=new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.titleContains("facebook"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			count=count+1;
			if(count==30)
			{
				throw new Exception("Browser is Not Up");
			}
			
		} while (flag==false);
		System.out.println("page load successful");
		
	}

}
