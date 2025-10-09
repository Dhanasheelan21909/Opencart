package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	@Test (groups = {"Sanity","Master"})
	public void verifyLogin()
	
		{
			logger.info("**** Starting TC_002_LoginTest  ****");
			logger.debug("capturing application debug logs....");
			
			try{// refers home page
			Homepage obj2 = new Homepage(driver);
			obj2.clickMyAccount();
			logger.info("Clicked on MyAccount Link.. ");
			obj2.clickLogin();
			logger.info("Clicked on Login Link under my account.. ");

			//refers login page
			LoginPage obj3 = new LoginPage(driver);
			logger.info("Entering valid mail and password ");

			obj3 . LoginEMailAddress(p.getProperty("email"));
			obj3 . LoginPassword(p.getProperty("password"));
			obj3 . clickLogin();
			logger.info("clicked on login Button");
			
			//my account page
			MyAccountPage obj4  = new MyAccountPage(driver);
			boolean TargetPage = obj4 .isMyAccountPageExists();
			Assert.assertEquals(TargetPage, true);
			}
			
			catch (Exception e) {
				Assert.fail();
			}
			logger.info("Finished TC_002_LoginTest");


	}

}
