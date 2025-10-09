package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccoountRegistrationPage;
import pageObjects.Homepage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass  {
	
	
	@Test (groups = {" Regression", "Master"}) 
	public  void Verify_Account_Registration() {
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");

		logger.debug("This is a debug log message");

try{
	

		Homepage obj = new Homepage(driver);
		obj.clickMyAccount();
		logger.info("Clicked on MyAccount Link.. ");
		obj.clickRegister();
		
		logger.info("Clicked on Register Link.. ");
		AccoountRegistrationPage ob1 =new AccoountRegistrationPage(driver);
		logger.info("Providing customer details...");


		ob1.setFirstName(RandomString().toUpperCase());
		ob1.setLastName(RandomString().toUpperCase());
		ob1.setEmail(RandomString()+"@gmail.com");   // cocncatination
		ob1.setTelephone(RandomNumber());
		String Password = RandomAlphaNumeric();
		ob1.setPassword(Password);
		ob1.setConfirmPassword(Password);
		ob1.setPrivacyPolicy();
		ob1.clickContinue();
		logger.info("Validating expected message..");
       String confimationmsg =  ob1.getConfirmationMsg();
        Assert.assertEquals(confimationmsg, "Your Account Has Been Created!");
        logger.info("Test passed");


	}
catch (Exception e){
	logger.error("Test Failed" + e.getMessage());
	Assert.fail("Test failed: " + e.getMessage());

} 

finally 

{

logger.info("***** Finished TC001_AccountRegistrationTest *****");

}
}

}
	
