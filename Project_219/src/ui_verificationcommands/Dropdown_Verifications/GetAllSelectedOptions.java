package ui_verificationcommands.Dropdown_Verifications;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * Note:--> This Method only works when object 
		 * 			is accept multiple option selection
		 * 			with in single dropdown
		 */
		
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
		
		//Reading only selected options at dropdown..
		List<WebElement> list=new Select(DOBmonth).getAllSelectedOptions();
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
		}
		

	}

}
