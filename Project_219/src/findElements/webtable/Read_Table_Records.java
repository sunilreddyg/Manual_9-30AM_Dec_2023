package findElements.webtable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Table_Records 
{
	static WebDriver driver;
	
	public Read_Table_Records() 
	{
		driver=new ChromeDriver();
		driver.get("https://in.investing.com/equities/icici-bank-ltd-historical-data");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//Reusable method to read  webtable data from specific row and cell
	public static String gettabledata(String tablexpath,int row, int cell)
	{
		return driver.findElement(By.xpath(tablexpath))
				.findElements(By.tagName("tr"))
				.get(row)
				.findElements(By.tagName("td"))
				.get(cell).getText();
	}

	public static void main(String[] args) 
	{
		new Read_Table_Records();
		String tableXpath="//table[@class='common-table medium js-table']";
		String Date=gettabledata(tableXpath, 3, 0);
		System.out.println(Date);
	}

}
