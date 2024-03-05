package javascript_Executor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Click_Method_Using_JSExecutor 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//WEbElement Inteface method
		//driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();
		
		//Using Mouse interaction class
		//new Actions(driver).click(driver.findElement(By.xpath("//a[contains(.,'Create new account')]"))).perform();
		
		//Using Javascript Click on Button
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement CreateAccount=driver.findElement(By.xpath("//a[contains(.,'Create new account')]"));
		js.executeScript("arguments[0].click()", CreateAccount);
		
		/*
		 * Note:--> Same click function we can use for
		 * 			links,button,checkboxes,Radiobuttons,listofoptions --etc
		 */
		
	}

}