package browser_options;

import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Block_popup_windows 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption
		("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		ChromeDriver chrome=new ChromeDriver(options);
		chrome.get("http://makemytrip.com");
		/*
		 * By default, ChromeDriver configures Chrome to 
		 * allow pop-up windows. If you want to block pop-ups 
		 * (i.e., restore the normal Chrome behavior when it is 
		 * not controlled by ChromeDriver), do the following:
		 */

	}

}
