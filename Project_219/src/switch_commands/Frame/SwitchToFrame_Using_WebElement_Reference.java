package switch_commands.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_WebElement_Reference {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		
		//Identifying frame element under webpage
		WebElement FrameElement=driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		//Switching to frame using Frame Location
		driver.switchTo().frame(FrameElement);
		
		
		//Identifying elemnet under frame
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		MobileNumber.sendKeys("9030248855");
		
		
		//Get Controls back to MainPage
		driver.switchTo().defaultContent();
	
		//Close Window at webpage
		WebElement CloseButton=driver.findElement(By.xpath("//i[@class='icon-close']"));
		CloseButton.click();
		
	}

}
