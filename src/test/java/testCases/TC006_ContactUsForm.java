package testCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;

public class TC006_ContactUsForm extends Baseclass {
	
	@Test
	public void validateContactUsForm() {
		HomePage hp=new HomePage(driver);
		hp.homepagedisplay();
		ContactUsPage cp=new ContactUsPage(driver);
		cp.clickonContactUs();
		cp.verifyGetinTouchVisible();
		cp.entername("patil");
		cp.enteremail("abcd@gmail.com");
		cp.entersubject("regarding cancel order");
		cp.entermessage("kindly help me");
		cp.clickonUploadfile("C:\\Users\\admin\\Desktop");
		cp.clickonsubmitbtn();
		Alert alt= driver.switchTo().alert();
		alt.accept();
		boolean succesmssag=cp.verifysccesmessage();
		String expected="Success! Your details have been submitted successfully.";
	    Assert.assertEquals(true, succesmssag);
	    cp.clickonhome();
		String home_url=driver.getCurrentUrl();
		String expURL="https://automationexercise.com/";
		Assert.assertEquals(home_url, expURL);
		logger.info("Test no 6 passed");
		
	}

}
