package testCases;

import java.time.Duration;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountCreatedPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;

public class TC001_AccountRegistrationTest extends Baseclass {
	     
	@Test
	
	public void Verify_Account_Registration() {
		logger.info("----------------testcase1 Started ----------");
		
		HomePage hp=new HomePage(driver);
		boolean messagehomepage= hp.homepagedisplay();
		Assert.assertEquals(messagehomepage, true);
		hp.clicksignup();
		logger.info("Clicked on sign up link");
		
		LoginPage lp= new LoginPage(driver);
		String name=RandomStringUtils.randomAlphabetic(7);
		lp.setTxtName(name);
		lp.setTxtEmail(name+"@gmail.com");
		//lp.setTxtEmail("pattttil2@gmail.com");
        lp.setBtnsignup();	
        logger.info("Clicked on sign up button");
        
        SignUpPage signup=new SignUpPage(driver);
        System.out.println(signup.setAccountInformationDisplay());
        signup.setSelectTitle();
        logger.info("Clicked on Title");
        signup.setTxtName(name);
        signup.setTxtpassword("9898989898");
        signup.setSelectdaydrop("1");
        signup.setSelectmonthdrop("June");
        signup.setSelectyeardrop("1993");
        signup.setChkNewletter();
        signup.setChkSpecialoffer();
        signup.setTxtfirstName("donalt");
        signup.setTxtlastName("Trump");
        signup.setTxtCompanyname("EXABEAM");
        signup.setTxtAdressLine1("KALA ROAD");
        signup.setTxtAdressline2("WAKAD");
        signup.setSelectCountry("India");
        signup.setTxtState("maharashtra");
        signup.setTxtCity("pune");
        signup.setTxtZipCode("422334");
        signup.setTxtMobNum("9999999999");
        
        signup.clickBtnCreateAccount();
        
        logger.info("Account created");
        AccountCreatedPage AccountpageCreated= new AccountCreatedPage(driver);
        AccountpageCreated.getCreatmessage();
        AccountpageCreated.clickBtncontinue();  
        logger.info("Clicked on continue button");
        
        

        hp.clickDelete();
        System.out.println("okkkkkkk");
        logger.info("click on delete account link");
        Assert.assertTrue(hp.verifydeletmessage());
        logger.info(" Accont deleted successfully");
        hp.clickContinuedelete();
        logger.info(" Click on Continur btn");
        logger.info("------testcase1 passed!!! -------------");
        
	}
	}


