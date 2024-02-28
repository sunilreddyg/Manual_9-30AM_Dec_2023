package webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Selection_Commands 
{

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		//Converting single dropdown into multiple
		//selection dropdown using javascript executor..
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('month').setAttribute('multiple','multiple')");
		
		
		//Checking dropdown is single option or multiple selection type
		WebElement DOBmonth=driver.findElement(By.id("month"));
		boolean flag=new Select(DOBmonth).isMultiple();
		System.out.println("Dropdown multiple selection type is :-->"+flag);
		
		
		//Deselect all options
		new Select(DOBmonth).deselectAll();
		Thread.sleep(4000);
		
		//Selecting multiple options
		new Select(DOBmonth).selectByIndex(2);
		new Select(DOBmonth).selectByIndex(4);
		new Select(DOBmonth).selectByIndex(6);
		
		Thread.sleep(4000);
		//Deselecing options
		new Select(DOBmonth).deselectByIndex(4);
		
		
		
	}

}
