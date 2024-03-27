package waitCommands;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Alert 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();     //Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    
	    //This action open alert at webbrowser
	    WebElement Alert_prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Alert_prompt_link.click();
	  
	    
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	    try {
			wait.until(ExpectedConditions.alertIsPresent()).accept();
			System.out.println("Alert is Presented");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
