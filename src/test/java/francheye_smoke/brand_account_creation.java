package francheye_smoke;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class brand_account_creation {


		WebDriver driverr;

		public brand_account_creation(WebDriver driverr) {
			this.driverr = driverr;
			PageFactory.initElements(driverr, this);
		}

		@FindBy(xpath = "//a[@class='md:flex hidden font-medium text-white bg-primary hover:bg-sec rounded-2xl px-8 py-2']")
		WebElement join;

		@FindBy(xpath = "//h1[normalize-space()='Company']")
		WebElement company;

		@FindBy(xpath = "//input[@placeholder='Brand Email']")
		WebElement brandEmail;

		@FindBy(xpath = "//input[@placeholder='Password']")
		WebElement brandPassword;

		@FindBy(xpath = "//input[@placeholder='Confirm Password']")
		WebElement confirmPassword;

		@FindBy(xpath = "//input[@id='termsAgreement']")
		WebElement agreeToTerm;

		@FindBy(xpath = "//button[normalize-space()='Sign Up']")
		WebElement signUp;

		@FindBy(xpath = "//input[@id='firstName']")
		WebElement brandFirstname;

		@FindBy(xpath = "//input[@id='lastName']")
		WebElement brandLastname;

		@FindBy(xpath = "//input[@placeholder='Search for a location']")
		WebElement location;

		@FindBy(xpath = "//input[@id='companyName']")
		WebElement companyName;

		@FindBy(xpath = "//input[@id='website']")
		WebElement companyWebsite;

		void Join() {
			join.click();
		}

		public void Company() {
			company.click();
		}

		public void BrandEmail() {
			brandEmail.sendKeys("i22ify4evx@secretmail.net");
		}

		public void BrandPassword() {
			brandPassword.sendKeys("Asdf12#%^6");
		}

		public void ConfirmPassword() {
			confirmPassword.sendKeys("Asdf12#%^6");
			;
		}

		public void AgreeToTerm() {
			agreeToTerm.click();
		}

		public void SignUp() {
			signUp.click();
		}

		public void BrandFirstname() {
			brandFirstname.sendKeys("Rohan");
		}

		public void BrandLastname() {
			brandLastname.sendKeys("Kapur");
		}

		public void Location() {
			location.sendKeys("New York");
		}

		public void CompanyName() {
			companyName.sendKeys("AgileOne");
		}

		public void CompanyWebsite() {
			companyWebsite.sendKeys("AgileOne.com"); 
		}

		public void sortCompanyType() {
			Select sc = new Select(driverr.findElement(By.xpath("//select[@id='companyType']")));
			sc.selectByVisibleText("Agency");
		}
	}


