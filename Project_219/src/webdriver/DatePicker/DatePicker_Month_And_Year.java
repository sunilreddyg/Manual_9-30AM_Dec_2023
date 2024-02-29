package webdriver.DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_Month_And_Year {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().window().maximize();
		
		//Open Callendar
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		
		//Selecting month in datapicker
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")))
		.selectByVisibleText("Dec");
		Thread.sleep(2000);
		
		new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")))
		.selectByVisibleText("2024");
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("31")).click();
		
		
		
	}

}
