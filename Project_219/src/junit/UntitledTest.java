package junit;

import org.junit.Test;
import org.junit.Before;

import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;


public class UntitledTest 
{
  
  private WebDriver driver;

  @Before
  public void setUp() 
  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MINDQ\\Desktop\\recent_drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
  }
  @After
  public void tearDown() throws Exception
  {
	  Thread.sleep(5000);
	  driver.quit();
  }
  
  
  @Test
  public void untitled() 
  {
    driver.get("https://support.orangehrm.com/portal/en/signin");
    driver.manage().window().setSize(new Dimension(780, 540));
    driver.switchTo().frame(0);
    driver.findElement(By.name("username")).sendKeys("sunil@gmail.com");
    driver.findElement(By.name("password")).sendKeys("hello@123");
    driver.findElement(By.xpath("//dl[4]/dd/input")).click();
  }
}
