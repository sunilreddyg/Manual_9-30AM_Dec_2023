package ui_verificationcommands.getmethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Get_Object_X_and_Y_Coorindates {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/home-loan-emi-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Identifying location
		WebElement Slider1=driver.findElement(By.xpath("(//div[contains(@class,'handle')])[1]"));
		//Read X Coorindates before drag to target
		int BeforeDrag_X=Slider1.getLocation().getX();
		
		new Actions(driver).dragAndDropBy(Slider1, 300, 0).perform();
		//Read X Coorindates after drag to target
		int AfterDrag_X=Slider1.getLocation().getX();
		
		if(AfterDrag_X >  BeforeDrag_X)
			System.out.println("Drage to Location Successfull===> "+(AfterDrag_X-BeforeDrag_X));
		else
			System.out.println("Failed to Drag");
		
		
		
		
	}

}
