package pageobjects.HRM.Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MenuTabs
{
	WebDriver driver;
	public MenuTabs(WebDriver driver) 
	{
		//It helps to find @Findby object under current class
		PageFactory.initElements(driver, this);
		
		//Stroring local references to global
		this.driver=driver;
	}

	@FindBy(xpath = "(//span[contains(.,'Admin')])[1]")
	public WebElement  admin;
	
	@FindBy(xpath = "//span[contains(.,'PIM')]")
	public WebElement  pIM;
	
	@FindBy(xpath = "//span[contains(.,'Leave')]")
	public WebElement  leave;
	
	@FindBy(xpath = "//span[contains(.,'Time')]")
	public WebElement  time;
	
	@FindBy(xpath = "//span[contains(.,'Recruitment')]")
	public WebElement  recruitment;
	
	@FindBy(xpath = "//span[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//span[contains(.,'Performance')]")
	public WebElement  performance;
	
	@FindBy(xpath = "(//span[contains(.,'Dashboard')])[1]")
	public WebElement  dashboard;
	
	@FindBy(xpath = "//span[contains(.,'Directory')]")
	public WebElement  directory;
	
	@FindBy(xpath = "//span[contains(.,'Maintenance')]")
	public WebElement  maintenance;
	
	@FindBy(xpath = "//span[contains(.,'Buzz')]")
	public WebElement  buzz;


	public void FocusAdminTab()
	{
		new Actions(driver).scrollToElement(admin).perform();
	}
	
	public void waitforadmin()
	{
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30))
			.until(ExpectedConditions.visibilityOf(admin));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickAdminTab()
	{
		admin.click();
	}
	
	public void ClickrecruitmentTab()
	{
		recruitment.click();
	}
	
	public void clickpimtab()
	{
		pIM.click();
	}
	
	public void clickmyinfo()
	{
		myInfo.click();
	}

}