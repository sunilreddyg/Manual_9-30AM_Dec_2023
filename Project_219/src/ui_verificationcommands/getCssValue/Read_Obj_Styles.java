package ui_verificationcommands.getCssValue;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;


public class Read_Obj_Styles 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		
		WebElement LoginBtn=driver.findElement(By.xpath("//button[contains(.,'Login')]"));
		
		//Read background color
		String BGcolor=LoginBtn.getCssValue("background-color");
		System.out.println("BG color in RGBA format--> "+BGcolor);
		//By default selenium read color or bgcolor in RGBA format
		
		String Exp_Color_in_HEX="#ff7b1d";
		
		//Using color class convert Color values
		Color Clr=Color.fromString(Exp_Color_in_HEX);
		String  Exp_Color_in_rgba=Clr.asRgba();
		
		//Comparing both colors
		if(BGcolor.equals(Exp_Color_in_rgba))
			System.out.println("Color match");
		else
			System.out.println("Color mismatch");
		
		
		
		//Reading object styles
		String FontSize=LoginBtn.getCssValue("font-size");
		System.out.println("Object Font Size is:--> "+FontSize);
		
		
		
		
	}

}
