package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

      public WebDriver ldriver;

	public LoginPage (WebDriver rdriver ) 
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this); 
	}


	@FindBy(xpath = "//*[@name='email']")
	private WebElement email_txt_Box;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password_txt_Box;

	@FindBy(xpath = "//*[@class='btn btn-dark btn-block' and @type='submit']")
	private WebElement login_Button;

	@FindBy(xpath = "//header/div[1]/div[2]/div[4]/button[1]/i[1]")
	private WebElement logout_Profile;

	@FindBy(xpath = "//header/div[1]/div[2]/div[4]/div[1]/a[2]")
	private WebElement logout_Button;

	public void enterEmail ( String email) {

		email_txt_Box.sendKeys(email);
	}

	public void enterPassword ( String pwd) 
	{
		password_txt_Box.sendKeys(pwd);
	}
	
	public void clickOnLoginButton () {
		
		login_Button.click();
	}
	
	public void clickOnLogoutProfile () {
		
		logout_Profile.click();	
	}
	
	public void clickOnLogoutButton () {
		
		logout_Button.click();
	}
}
