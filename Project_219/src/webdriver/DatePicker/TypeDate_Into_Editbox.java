package webdriver.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeDate_Into_Editbox {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		driver.manage().window().maximize();
		
		//Type Date into editbox when it was defined in writable format..
		WebElement DateEntrybox=driver.findElement(By.id("datepicker"));
		DateEntrybox.sendKeys("07/28/2023"+Keys.ESCAPE);

	}

}
