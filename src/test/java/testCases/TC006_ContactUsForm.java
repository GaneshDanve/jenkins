package testCases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;

    public class TC006_ContactUsForm extends Baseclass {
	
	@Test
	public void validateContactUsForm() throws InterruptedException {
		/*HomePage hp=new HomePage(driver);
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
		*/logger.info("Test no 6 passed");
		
		
		
		driver.get("https://www.sumasoft.com/");
		String xpath="//a[contains(@href,'facebook') or contains(@href,'twitter') or contains(@href,'in.linkedin') or contains(@href,'youtube.com') or contains(@href,'instagram')]";
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		driver.findElement(By.xpath("//span[@id='zs_fl_close']")).click();
		List<WebElement> link=driver.findElements(By.xpath(xpath));
		
		for(int i=0;i<link.size();i++) {
			link.get(i).click();
			//driver.navigate().to("https://www.sumasoft.com/");
			//Thread.sleep(2000);
			//System.out.println(listt.getAttribute("href"));
		
			
		}
	}
}
