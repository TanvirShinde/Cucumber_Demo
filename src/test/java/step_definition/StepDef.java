package step_definition;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import page_object.LoginPage;

public class StepDef {

	public WebDriver driver;
	
	  public LoginPage lp;
	
	public void objectCreation () {
		
		 lp = new LoginPage (driver) ;
	}

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		objectCreation () ;
		
		driver.manage().window().maximize();
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	
		driver.get(url);  
		
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email_id, String pwd) {
	
		lp.enterEmail(email_id);
		
		lp.enterPassword(pwd); 

	}

	@When("Click on Login")
	public void click_on_login() {
	 
		lp.clickOnLoginButton();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) throws InterruptedException {

		Thread.sleep(5000);
		String actualTitle=driver.getTitle();

		if(actualTitle.equals(expectedTitle))
		{
	
			
			Assert.assertTrue(true);    
		}
		else
		{
			Assert.assertTrue(false);//fail

		}
		    
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
	
		lp.clickOnLogoutProfile();
		
		lp.clickOnLogoutButton();
	}

	
	@Then("Page title should be {string}")
	public void page_title_should_be1(String expectedTitle) throws InterruptedException {
	   
		Thread.sleep(5000);
		
		String actualTitle=driver.getTitle();

		if(actualTitle.equals(expectedTitle))
		{
	

			Assert.assertTrue(true);//pass
			
			
		}
		else
		{
			Assert.assertTrue(false);//fail

		}
		
	
	}

	@Then("close browser")
	public void close_browser() {
	   
		driver.close();
		
		driver.quit();
	}

	
}
