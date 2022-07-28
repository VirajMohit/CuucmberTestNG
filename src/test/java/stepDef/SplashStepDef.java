package stepDef;

import java.io.FileNotFoundException;
import java.io.IOException;

import base.TestBase;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SplashPage;

public class SplashStepDef {
	
	@Before(order=2)
	public void setup0() {
		System.out.println(".... Before All....");
	}
	
	@Before(order=1, value="@RegressionTest")
	public void setup() {
		System.out.println(".... Before Regression test....");
	}
	
	@Before(order=1, value="@SmokeTest")
	public void setupSmoke() {
		System.out.println(".... Before Smoke test....");
	}
	
	@Given("User launches Discovery App")
	public void launchURL() throws FileNotFoundException, IOException {
		TestBase.initializeDriver();
	}
	
	@When("{string} closes Privacy popup on splash page")
	public void user_closes_privacy_popup_on_splash_page(String param) {
		System.out.println("Parameter value - " + param);
		SplashPage splashPage = new SplashPage();
		splashPage.closePrivacyPopupButton.click();
	}
	@Then("Splash page should be displayed")
	public void splash_page_should_be_displayed() {
		SplashPage splashPage = new SplashPage();
		splashPage.letsGetStarted.isDisplayed();
	}
	
	@Then("User closes browser")
	public void close_browser() {
		TestBase.closeBorwser();
	}
	

	@Given("User is signed in")
	public void user_is_signed_in() {
	}
	@Then("Adds contact")
	public void adds_contact() {
	}

	@Then("Views contact details")
	public void views_contact_details() {
	}

	@Then("Updates contact")
	public void updates_contact() {
	}

	@Then("Deletes contact")
	public void deletes_contact() {
	}

	@Then("Adds Deal")
	public void adds_deal() {
	}

	@Then("Views Deal details")
	public void views_deal_details() {}


	@Then("Updates Deal")
	public void updates_deal() {}

	@Then("Deletes Deal")
	public void deletes_deal() {}


	@Then("Adds Task")
	public void adds_task() {}

	@Then("Views Task details")
	public void views_task_details() {}


	@Then("Updates Task")
	public void updates_task() {}

	@Then("Deletes Task")
	public void deletes_task() {}



}
