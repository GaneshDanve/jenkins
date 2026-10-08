package testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountCreatedPage;
import pageObjects.Delete_AccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;

public class TC002_Login_with_valid_crendentials extends Baseclass {
	
	@Test
	public void loginPagewithcorrectcredentials() {
		
		HomePage hp=new HomePage(driver);
		boolean messagehomepage= hp.homepagedisplay();
		//System.out.println(messagehomepage); 
		Assert.assertEquals(messagehomepage, true);
		hp.clicksignup();
		logger.info("Clicked on sign up link");
		
		LoginPage lp= new LoginPage(driver);
		//RandomStringUtils rm=new Random();
		String name=RandomStringUtils.randomAlphabetic(7);
		lp.setTxtName(name);
		String email=lp.setTxtEmail(name+"@gmail.com");
        lp.setBtnsignup();	
        logger.info("Clicked on sign up button");
        
        SignUpPage signup=new SignUpPage(driver);
        System.out.println(signup.setAccountInformationDisplay());
        signup.setSelectTitle();
        logger.info("Clicked on Title");
        signup.setTxtName(name);
        signup.setTxtpassword("98989898");
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
        
      //  signup.clickBtnCreateAccount();
        
        logger.info("Account created");
        AccountCreatedPage AccountpageCreated= new AccountCreatedPage(driver);
        AccountpageCreated.getCreatmessage();
        AccountpageCreated.clickBtncontinue();  
        logger.info("Clicked on continue button");
        
		hp.clicklogoutbtn();
		
		logger.info("Clicked on logout button");
        hp.logo();
        logger.info("Home Page Display with Logo");
		hp.clicksignup();
		logger.info("click on signup/login");
		lp.verifyLogintoyouraccount();
		logger.info("sign in page display");
        
        lp.entremailadress_signIn(email);
        lp.entrepassword_signIn("98989898");
        lp.clickloginBtn();
        logger.info("click on login btn");
        hp.loginAsname();
        logger.info("loginAs visible");
        hp.clickDelete();
        logger.info("click on account delete btn");
        Delete_AccountPage delete=new Delete_AccountPage(driver);
        //delete.deletemessage();
        Assert.assertEquals(true, delete.deletemessage());
        logger.info("Assertion for delete message");
	}
              
}
