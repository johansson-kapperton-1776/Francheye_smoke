package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class brandaccountpage {


	public brandaccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	@FindBy(xpath = "//h2[normalize-space()='Storytelling For Brands Through Creators']")
	WebElement title;
	
	@FindBy(xpath = "//a[normalize-space()='Join Francheye']")
	WebElement join;

	@FindBy(xpath = "//button[normalize-space()='Brand']")
	WebElement brand;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email2;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password2;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath = "//input[@id='web']")
	WebElement website;
	
	@FindBy(xpath = "//button[normalize-space()='Next']")
	WebElement websitenext;
	
	@FindBy(xpath = "//input[@id='instagram']")
	WebElement instagram;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;
	
	@FindBy(xpath = "//textarea[@id='mission']")
	WebElement mission;

	@FindBy(xpath = "//textarea[@id='vision']")
	WebElement vision;

	@FindBy(xpath = "//textarea[@id='product']")
	WebElement product;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit2;
	
	@FindBy(xpath = "//div[normalize-space()='Entertainment']")
	WebElement entertainment;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit3;

	
	public void clickJoin() {
		join.click();
	}
	
	public void clickBrand() {
		brand.click();
	}
	
	public void enterName() {
		name.sendKeys("Johansson");
	}
	public void enterEmail(String email) {
		email2.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		password2.sendKeys(password);
	}
	public void enterconfirmPassword() {
		confirmpassword.sendKeys("Redskin01");
	}
	public void clickSignUp() {
		signup.click();
	}
	
	public void enterWebsite() {
		website.sendKeys("https://monday.com/");
	}
	
	public void clickNext() {
		websitenext.click();
	}
	
	public void enterInstagram() {
		instagram.sendKeys("https://www.instagram.com/j_kapperton_14/");
	}
	
	
	public void clickSumbit() {
		submit.click();
	}
	
	public void enterMission() {
		mission.sendKeys("To generate views");
	}
	
	public void enterVision() {
		vision.sendKeys("I make content related to Automation testing.");
	}
	public void enterProduct() {
		product.sendKeys("CUCUMBER");
	}
	public void clickSumbit2() {
		submit2.click();
	}
	public void clickEntertainment() {
		entertainment.click();
		
		
	}
	public void clickSubmit3() {
		submit3.click();
	}
	

}
