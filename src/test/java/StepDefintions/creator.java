package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Base;
import PageObject.creatoraccountpage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class creator {
	
	public WebDriver driver = Base.getDriver();
	public creatoraccountpage ca = new creatoraccountpage(driver);

	
	@Given("that I am on francheye.com and want to create a creator account")
	public void that_i_am_on_francheye_com_and_want_to_create_a_creator_account() throws InterruptedException {
		driver.get("https://francheye.com");
		Thread.sleep(500);
	}

	@When("I click join button")
	public void i_click_join_button() throws InterruptedException {
		ca.clickJoin();
		Thread.sleep(500);
	}

	@When("I click creator button")
	public void i_click_creator_button() throws InterruptedException {
	    ca.clickcreator();
	    Thread.sleep(500);
	}

	@Then("user is re-directed to creater sign up page")
	public void user_is_re_directed_to_creater_sign_up_page() throws InterruptedException {
	    Thread.sleep(500);
	}

	@Then("I enter my name")
	public void i_enter_my_name() throws InterruptedException {
	   ca.enterName();
	    Thread.sleep(500);
	}

	@Then("I enter my email")
	public void i_enter_my_email() throws InterruptedException {
	    ca.enterEmail();
	    Thread.sleep(500);
	}

	@Then("I create my password")
	public void i_create_my_password() throws InterruptedException {
	    ca.enterPassword();
	    Thread.sleep(500);
	}

	@Then("I confirm my password")
	public void i_confirm_my_password() throws InterruptedException {
	    ca.enterconfirmPassword();
	    Thread.sleep(500);
	}

	@Then("I click sign up")
	public void i_click_sign_up() throws InterruptedException {
	   ca.clickSignUp();
	    Thread.sleep(500);
	}

	@Then("I am re-directed to the email confirmation page and a code is sent to my email")
	public void i_am_re_directed_to_the_email_confirmation_page_and_a_code_is_sent_to_my_email() {
	 
	}


	@Then("I am re-directed to onboarding page and first question of query appears")
	public void i_am_re_directed_to_onboarding_page_and_first_question_of_query_appears() {
	    
	}

	@Then("I select the region I live in")
	public void i_select_the_region_i_live_in() {
	   
	}

	@Then("I select the creator niche")
	public void i_select_the_creator_niche() {
	  
	}

	@Then("I select what I am looking to partner on")
	public void i_select_what_i_am_looking_to_partner_on() {
	    
	}

	@Then("I connect my socials")
	public void i_connect_my_socials() {
	   
	}

	@Then("I click next")
	public void i_click_next() {
	    
	}

	@Then("I am redirected to my account dashboard")
	public void i_am_redirected_to_my_account_dashboard() {
	    
	}


}
