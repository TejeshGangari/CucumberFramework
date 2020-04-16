package stepDefinition;

import org.testng.Assert;

import base.ReusableLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectManagers.PageObjectManager;
import objectManagers.WebFactory;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginFeature extends ReusableLibrary{

	public PageObjectManager pom;
	public LoginPage loginPage;
	public HomePage homePage;
	
	@Before
	public void setUp() {
		driver = WebFactory.getDriver("CHROME");
		pom = new PageObjectManager(driver);
		loginPage = pom.getLoginPageObject();
		homePage = pom.getHomePageObject();
	}
	
	@Given("^Open the application$")
	public void open_the_application(){ 
	    driver.get(prop.getProperty("URL"));
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("^user enters userName, password and click on login button$")
	public void user_enters_userName_password_and_click_on_login_button(){
	    loginPage.setUserName();
	    loginPage.setPassword();
	    loginPage.clickLogin();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed(){
	    Assert.assertTrue(homePage.linkHome.isDisplayed());
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
