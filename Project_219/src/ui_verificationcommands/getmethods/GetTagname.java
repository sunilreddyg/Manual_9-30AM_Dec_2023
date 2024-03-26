package ui_verificationcommands.getmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTagname {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();

		
		//Getting element tagname at runtime...
		WebElement DOBday=driver.findElement(By.xpath("//select[@id='day']"));
		if(DOBday.getTagName().equals("select"))
		{
			new Select(DOBday).selectByIndex(3);
			System.out.println("dropdown option selected");
		}
		else
			System.out.println("Element is not a select type dropdown");
	}

}
