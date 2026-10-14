package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(@href,'contact_us')]")
	WebElement Contactus;
	
	@FindBy(xpath="//div[contains(@class,'contact-form')]/h2")
	WebElement GetInTouch;
	
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txtname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement txtsubject;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement txtmessage;
	
	@FindBy(xpath="//input[@name='upload_file']")
	WebElement uploadfile;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitbtn;
	
	
	@FindBy(xpath="//div[@class='status alert alert-success']")
	WebElement successmessage;
	
	@FindBy(xpath="//a[@class='btn btn-success']/span")
	WebElement homepage;
	
	public void clickonContactUs() {
		Contactus.click();
	}
	
	public void verifyGetinTouchVisible() {
		GetInTouch.isDisplayed();
	}
	public void entername(String name) {
		txtname.sendKeys(name);
	}
	public void enteremail(String email) {
		txtemail.sendKeys(email);
	}
	public void entersubject(String subject) {
		txtsubject.sendKeys(subject);
	}
	public void entermessage(String message) {
		txtmessage.sendKeys(message);
	}
	public void clickonUploadfile(String path) {
		uploadfile.sendKeys(path);
	}
	public void clickonsubmitbtn() {
		submitbtn.click();
	}
	public boolean verifysccesmessage() {
		return successmessage.isDisplayed();
	}
	public void clickonhome() {
		homepage.click();
	}
}
