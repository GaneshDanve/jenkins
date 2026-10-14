package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import utilities.ReadConfig;

public class TC004_LogOutUser extends Baseclass {
	
	ReadConfig readconfig = new ReadConfig();
	String email = readconfig.getemail();
	String password = readconfig.getpassword();
	
	@Test
	public void verifyLogout() {
		HomePage hp=new HomePage(driver);
		boolean messagehomepage= hp.homepagedisplay();
		Assert.assertEquals(messagehomepage, true);
		logger.info("Home Page Displayed");
		hp.clicksignup();
		logger.info("Clicked on sign up link");
		
		LoginPage lp= new LoginPage(driver);
		lp.verifyLogintoyouraccount();
		logger.info("Login into your account is visisble");
		lp.entremailadress_signIn(email);
        lp.entrepassword_signIn(password);
        lp.clickloginBtn();
        logger.info("click on login btn");
        hp.loginAsname();
        logger.info("login As user visible");
        hp.clicklogoutbtn();
        logger.info("click on logout button");
        String Actualurl=driver.getCurrentUrl();
        System.out.println(Actualurl);
        String expectedUrl="https://automationexercise.com/login";
        Assert.assertEquals(Actualurl, expectedUrl);
		
	}

}
