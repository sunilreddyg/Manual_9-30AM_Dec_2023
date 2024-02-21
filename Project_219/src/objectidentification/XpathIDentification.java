package objectidentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIDentification {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();

	}

}
