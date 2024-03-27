package waitCommands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Attribute {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		
		//Refresh page once
		driver.navigate().refresh();
		
		//Enabling explicit wait at automation browser
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		/*try {
			wait.until(ExpectedConditions.
					frameToBeAvailableAndSwitchToIt("notification-frame-b8a69227"))
			.findElement(By.xpath("//a[@class='close']")).click();
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

		
		By Roundtrip=By.xpath("//li[@data-cy='roundTrip']");
		try {
			wait.until(ExpectedConditions.
					visibilityOfElementLocated(Roundtrip)).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			By DoubleSeatFare=By.xpath("//ul[@class='specialFareNew']/li[6]");
			wait.until(ExpectedConditions.attributeContains(DoubleSeatFare, "class", "isItemDisabled"));
			System.out.println("Double Seat fares object is disabled");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
