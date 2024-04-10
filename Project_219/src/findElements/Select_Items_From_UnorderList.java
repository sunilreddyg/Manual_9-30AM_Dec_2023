package findElements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Select_Items_From_UnorderList 
{

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
	
		
		WebElement Banner=driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
		Banner.click();
		Thread.sleep(2000);
		
		//Finding List of Options Under Dropdown
		WebElement unorderlist=driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']"));
		List<WebElement> All_list=unorderlist.findElements(By.tagName("li"));
		All_list.remove(0);
		System.out.println(All_list.size());
		
		boolean flag=false;
		for (WebElement Eachlist : All_list) 
		{
				
			if(Eachlist.getText().equalsIgnoreCase("Loans"))
			{
				Eachlist.click();
				Thread.sleep(3000);
				WebElement Banner2=driver.findElement(By.xpath("//a[contains(.,'Select Product')]"));
				Banner2.click();
				Thread.sleep(2000);
				
				WebElement Sublist=driver.findElement(By.xpath("//ul[@class='dropdown2 dropdown-menu']"));
				List<WebElement> SublistOptions=Sublist.findElements(By.tagName("li"));
				SublistOptions.remove(0);
				for (WebElement Eachsublist : SublistOptions) 
				{	
				
					if(Eachsublist.getText().equalsIgnoreCase("Home Loan"))
					{
						flag=true;
						Eachsublist.click();
						break;  //To jump out from inner loop
					}
				}
				
				if(flag==true)
				{
					break;  //To jump out from outter loop
				}
		
			}
		
		}

}
	
}
