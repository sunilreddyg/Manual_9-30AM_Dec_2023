package ui_verificationcommands.getmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckObject_Visibility_using_Location {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Identifying location
		WebElement Slider1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));

		if(Slider1.getLocation().getX() > 0)
			System.out.println("Slider1 is visible");
		else
			System.out.println("Slider1 is not visible");
		
	}

}
