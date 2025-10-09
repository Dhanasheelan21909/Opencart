package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = ("//input[@id='input-email']"))
	WebElement LoginEMailAddress;
	
	@FindBy(xpath = ("//input[@id='input-password']"))
	WebElement LoginPassword;
	
	@FindBy(xpath = ("//input[@value='Login']"))
	WebElement LoginBTN;
	
	
	public void LoginEMailAddress(String email)
	{
		LoginEMailAddress.sendKeys(email);	
	}
	
	public void LoginPassword(String pwd)
	{
		LoginPassword.sendKeys(pwd);	
	
	}
	public void clickLogin()
	{
		LoginBTN.click();
		
	}
	

}
