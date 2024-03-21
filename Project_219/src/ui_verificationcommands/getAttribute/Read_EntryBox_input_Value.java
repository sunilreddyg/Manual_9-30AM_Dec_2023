package ui_verificationcommands.getAttribute;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_EntryBox_input_Value {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		
		
		WebElement DateEB=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		String Act_Date=DateEB.getAttribute("value");
		System.out.println(Act_Date);
		
		
		//Get Sytem Date and convert into Required format
		String Exp_Date=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		

		//Verify Actual date match with expected date
		if(Exp_Date.equals(Act_Date))
			System.out.println("Date Match");
		else
			System.out.println("Date mismatch");
	}

}
