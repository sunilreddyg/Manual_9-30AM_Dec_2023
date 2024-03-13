package browser_options;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Add_BrowserPluginIns {

	public static void main(String[] args)  {
		
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\IDE.crx"));
		options.addExtensions(new File("C:\\Users\\MINDQ\\Downloads\\TruePath.crx"));
	
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");

	}

}
