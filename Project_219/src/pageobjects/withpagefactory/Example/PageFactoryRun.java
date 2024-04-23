package pageobjects.withpagefactory.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryRun {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		
		//To identify @Findby annotated objects
		//We should follow pagefactory library class
		
		InstaHome home=PageFactory.initElements(driver, InstaHome.class);
		home.waitforpage();
		home.clickonsignup();
		
		InstaSignup signup=PageFactory.initElements(driver, InstaSignup.class);
		signup.waitforsignuppage();
		signup.enteremail("sunil@gmail.coom");
		signup.enterfullnemae("SunlReddy");
	}

}
