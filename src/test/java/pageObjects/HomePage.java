 package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.Baseclass;

public class HomePage extends Baseclass {
	
	WebDriver driver;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
 	}
	
	
	//Identify WebElement
	
	@FindBy(xpath="//div[@id='slider-carousel']")
	WebElement Homepagedisplay;
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement btnsignuplogin;
	
	@FindBy(xpath="//a[contains(., 'Logged in as')]")
	WebElement logedIn;
	
	@FindBy(xpath="//a[@href='/delete_account']")
	WebElement DeleteAccount;
	
	@FindBy(xpath="//h2[@data-qa='account-deleted']")
	WebElement VerifyDeleteMessage;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement DeleteContinueBtn;
	
	@FindBy(xpath="//img[@src='/static/images/home/logo.png']")
	WebElement HomePageLogo;
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logoutbtn;
	
	
	 
	
	//Performing Action on WebElement
	public boolean homepagedisplay() {
	 return Homepagedisplay.isDisplayed();
	}
	
	public void clicksignup() {
	btnsignuplogin.click();
	} 
	
	public boolean verifylogindone() {
		return logedIn.isDisplayed();
		}
	
	public void clickDelete() {
		DeleteAccount.click();
	}
	
	public boolean verifydeletmessage() {
	       return VerifyDeleteMessage.isDisplayed();
	}
	public void clickContinuedelete() {
		DeleteContinueBtn.click();
	}
	public boolean logo() {
		return HomePageLogo.isDisplayed();
	}
	public void clicklogoutbtn() {
		logoutbtn.click();
		} 
	
    }
