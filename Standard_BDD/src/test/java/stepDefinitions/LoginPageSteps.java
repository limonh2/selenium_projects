package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.SearchClaimantPage;
import pageObjects.ViewClaimantDetailsPage;
import utils.TestContextSetup;

@SuppressWarnings("unused")
public class LoginPageSteps {
	public WebDriver driver;
	TestContextSetup testContextSetup;
	LoginPage loginPage;

	ViewClaimantDetailsPage viewClaimantDetailspage;

	public LoginPageSteps(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();

		this.viewClaimantDetailspage = testContextSetup.pageObjectManager.getViewClaimantDetailsPage();
	}

	@Given("^I am in the login page$")
	public void i_am_in_the_login_page() throws Throwable {

		loginPage.LoginintoApp();

		System.out.println("login page");
	}

	@And("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
		System.out.println("credentials were entered");
	}

	@Then("^Welcome page should display$")
	public void welcome_page_should_display() throws Throwable {
		viewClaimantDetailspage.verifyWelcomeMessage();
		System.out.println("user is logged into the applcation");

	}
}
