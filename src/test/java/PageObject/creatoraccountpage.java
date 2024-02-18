package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatoraccountpage {

	
	public creatoraccountpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	WebDriver driver;
	
	@FindBy(xpath = "//a[normalize-space()='Join Francheye']")
	WebElement join;
	
	@FindBy(xpath = "//button[normalize-space()='Creator']")
	WebElement creator;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='confirmPassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	WebElement signup;
	
	public void clickJoin() {
		join.click();
	}
	
	public void clickcreator() {
		creator.click();
	}
	
	public void enterName() {
		name.sendKeys("Johansson");
	}
	public void enterEmail() {
		email.sendKeys("bflyh63w9t@secretmail.net");
	}
	
	public void enterPassword() {
		password.sendKeys("Redskin01");
	}
	public void enterconfirmPassword() {
		confirmpassword.sendKeys("Redskin01");
	}
	public void clickSignUp() {
		signup.click();
	}
}
