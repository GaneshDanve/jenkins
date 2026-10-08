package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_AccountPage {
           WebDriver driver;
	
	//constructor
	public Delete_AccountPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
 	}
	
	
	//Identify WebElement
	
	@FindBy(xpath="//b[text()='Account Deleted!']")
	WebElement DeleteMessage;
	
	public boolean deletemessage() {
		return DeleteMessage.isDisplayed();
	}
}
