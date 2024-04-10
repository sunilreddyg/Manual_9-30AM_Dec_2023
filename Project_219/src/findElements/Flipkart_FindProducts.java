package findElements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_FindProducts 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement SearchBox=driver.findElement(By.xpath("//input[@name='q']"));
		SearchBox.clear();
		SearchBox.sendKeys("iphone 13 pro"+Keys.ENTER);
		
		
		

		By NextButton=By.xpath("//span[contains(.,'Next')]");
		By ProductsPage=By.xpath("//div[@class='_1YokD2 _3Mn1Gg']");
		boolean visible_status=false;
		do {
			
			
			List<WebElement> products=driver.findElement(ProductsPage)
			.findElements(By.className("_1AtVbE"));
			
			for (int i = 1; i < products.size()-2; i++) 
			{
					//Get Each product
					WebElement EachProduct=products.get(i);
					
					//Read Productname and Price
					String Productname=EachProduct.findElement(By.className("_4rR01T")).getText();
					String Productprice=EachProduct.findElement(By.className("_30jeq3")).getText();
					
					//System.out.println(Productname+"    "+Productprice);
					
					//Regular extpression to read only numbers
					String Price=Productprice.replaceAll("[^0-9]", "");
					//Converting String value to integer
					int Newprice=Integer.parseInt(Price);
					
					Double dbleprice=new Double(Newprice);  //AutoWrapping
					if(dbleprice > 150000)
					{
						System.out.println(Productname+"   "+dbleprice);
					}
			}	
			
			
			try {
				visible_status=new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.invisibilityOfElementLocated(NextButton));
			} catch (Exception e) {
				driver.findElement(NextButton).click();
				Thread.sleep(5000);
				//e.printStackTrace();
			}
		} while (visible_status==false);
		
		
	}

}
