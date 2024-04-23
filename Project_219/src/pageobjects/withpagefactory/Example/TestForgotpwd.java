package pageobjects.withpagefactory.Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestForgotpwd {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		//To identify @Findby annotated objects
		//We should follow pagefactory library class
				
		InstaHome home=PageFactory.initElements(driver, InstaHome.class);
		home.waitforpage();
		home.clickforgotpassword();
		
		Forgotpwd fpwd=new Forgotpwd(driver);
		fpwd.waitforfogotaccountpage();
		fpwd.enteremail("sunil@gmail.com");

	}

}
