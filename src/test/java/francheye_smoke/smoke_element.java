package francheye_smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class smoke_element {

	WebDriver driver;
	
	public smoke_element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Join Francheye']")
	WebElement join;
	
	@FindBy(xpath ="//h1[normalize-space()='Creator']")
	WebElement creator;
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement creatoremail;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement creatorpassword;
	
	@FindBy(xpath = "//input[@placeholder='Confirm Password']")
	WebElement creatorconfirmpassword;
	
	@FindBy(xpath = "//input[@id='termsAgreement']")
	WebElement termsagreement;
	
	@FindBy(xpath = "//button[normalize-space()='Sign Up']")
	WebElement signupcreator; 
	
	// -----------------------------------------------------------------
	
	@FindBy(xpath = "//a[contains(@class,'mx-2 hover:outline-primary rounded-3xl px-6 py-2 outline outline-sec dark:text-gray-50')]")
	WebElement login;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath = "//div[@class='w-max p-1 px-3 border-[1px] border-black rounded-md flex items-center justify-between gap-4 relative cursor-pointer']//*[name()='svg']")
	WebElement arrow;
	
	@FindBy(xpath = "//h1[normalize-space()='Youtube']")
	WebElement youtube;
	
	
	void clickjoin()  {
		join.click();
	}

	void creatorbutton()  {
		creator.click();
	}
	void enteremail()  {
		creatoremail.sendKeys("wbanob7atv@secretmail.net");
	}

	void enterpassword()  {
		creatorpassword.sendKeys("Redskin01");
	}
	
	void enterconfirm()  {
		creatorconfirmpassword.sendKeys("Redskin01");
	}
	
	void clickbox()  {
		termsagreement.click();
	}
		
	void signup()  {
		signupcreator.click();
	}
		
		
	}


