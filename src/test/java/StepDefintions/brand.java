package StepDefintions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import PageObject.Base;
import PageObject.brandaccountpage;
import io.cucumber.java.en.*;

public class brand {
	
	public static WebDriver driver = Base.getDriver();
	public brandaccountpage ba = new brandaccountpage(driver);
	
	@Given("that I am on francheye.com and want to create a brand account")
	public void that_i_am_on_francheye_com_and_want_to_create_a_brand_account() throws InterruptedException {
		driver.get("https://francheye.com");
		// Assert.assertEquals("Storytelling For Brands Through Creators", ba.checktitle(), "Storytelling For Brands Through Creators");
		Thread.sleep(500);
	}
	
	@When("I click join button for brand")
	public void i_click_join_button_for_brand() throws InterruptedException {
		ba.clickJoin();
		Thread.sleep(500);
	}

	@When("I click brand button")
	public void i_click_brand_button() throws InterruptedException {
	  ba.clickBrand();
	  Thread.sleep(500);
	}

	@Then("user is re-directed to brand sign up page")
	public void user_is_re_directed_to_brand_sign_up_page() throws InterruptedException {
		Thread.sleep(500);
	}

	@Then("I enter the brand name")
	public void i_enter_the_brand_name() throws InterruptedException {
	    ba.enterName();
	    Thread.sleep(500);
	}
	
	@Then("I enter my brand email {string}")
	public void i_enter_my_brand_email(String email) throws InterruptedException {
		 ba.enterEmail(email);
		 Thread.sleep(500);
	}

	@Then("I create my brand password {string}")
	public void i_create_my_brand_password(String password) throws InterruptedException {
		  ba.enterPassword(password);
		  Thread.sleep(500);
	}
	

	@Then("I confirm my brand password")
	public void i_confirm_my_brand_password() throws InterruptedException {
	    ba.enterconfirmPassword();
	    Thread.sleep(500);
	}
	
	@Then("I click brand sign up")
	public void i_click_brand_sign_up() throws InterruptedException {
	   ba.clickSignUp();
	    Thread.sleep(500);
	}

	@Then("I am re-directed to the email confirmation page")
	public void i_am_re_directed_to_the_email_confirmation_page() throws InterruptedException {
		Thread.sleep(20000);
	}

	@Then("a code is sent to my email")
	public void a_code_is_sent_to_my_email() throws InterruptedException {
		Thread.sleep(20000);
	}
	@Then("I am re-directed to onboarding page and first question of brand query appears")
	public void i_am_re_directed_to_onboarding_page_and_first_question_of_brand_query_appears() throws InterruptedException {
	    Thread.sleep(20000);
	}

	@Then("I enter my company website")
	public void i_enter_my_company_website() throws InterruptedException {
	    ba.enterWebsite();
	    Thread.sleep(500);
	    ba.clickNext();
	    Thread.sleep(500);
	}

	@Then("I enter my social media links")
	public void i_enter_my_social_media_links() throws InterruptedException {
	   ba.enterInstagram();
	   Thread.sleep(500);
	   ba.clickSumbit();
	   Thread.sleep(500);
	}

	@Then("I answer the company details questions")
	public void i_answer_the_company_details_questions() throws InterruptedException {
	  ba.enterMission();
	  Thread.sleep(500);
	  ba.enterVision();
	  Thread.sleep(500);
	  ba.enterProduct();
	  Thread.sleep(500);
	  ba.clickSumbit2();
	  Thread.sleep(500);
	}

	@Then("I select what industry I am in")
	public void i_select_what_industry_i_am_in() throws InterruptedException {
	    ba.clickEntertainment();
	    Thread.sleep(500);
	    ba.clickSubmit3();
	}

	@Then("I answer what I am looking to partner on")
	public void i_answer_what_i_am_looking_to_partner_on() {
	   Assert.fail();
	}

	@Then("I am re-directed to my account dashboard")
	public void i_am_re_directed_to_my_account_dashboard() {
	    
	}


}
