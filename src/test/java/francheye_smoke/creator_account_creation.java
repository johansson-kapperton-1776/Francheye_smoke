package francheye_smoke;

import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class creator_account_creation {

	WebDriver driver;

	public creator_account_creation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='font-medium text-white bg-primary hover:bg-sec rounded-2xl px-8 py-2']")
	WebElement join;

	@FindBy(xpath = "//h1[normalize-space()='Creator']")
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

	@FindBy(xpath = "//input[@placeholder='John']")
	WebElement name;

	@FindBy(xpath = "//input[@placeholder='Doe']")
	WebElement lastname;

	@FindBy(xpath = "//input[@placeholder='Search for a location']")
	WebElement location;

	@FindBy(xpath = "//input[@placeholder='JohnnyDoe01']")
	WebElement username;

	@FindBy(xpath = "//div[@class='w-max px-14 py-3 bg-black text-white font-bold rounded-md cursor-pointer']")
	WebElement nextbutton;

	@FindBy(xpath = "//input[@name='email1']")
	WebElement email1;

	@FindBy(xpath = "//input[@name='email2']")
	WebElement email2;

	@FindBy(xpath = "//input[@name='email3']")
	WebElement email3;

	@FindBy(xpath = "//div[@class='px-14 py-3 bg-black text-white font-bold rounded-md cursor-pointer']")
	WebElement emailnext;
	
	@FindBy(xpath="//div[@class='w-max px-8 md:px-12 py-2 bg-black text-white font-bold rounded-md cursor-pointer']")
	WebElement filenext;
	

	@FindBy(xpath = "//textarea[@name='bio']")
	WebElement bio;
	
	@FindBy(xpath = "//div[@class='w-max px-8 md:px-12 py-2 bg-black text-white font-bold rounded-md cursor-pointer']")
	WebElement bionext;
	
	
	@FindBy(xpath = "//input[@placeholder='Type the language']")
	WebElement language;
	
	@FindBy(xpath = "//div[@class='px-12 py-3 p-3 bg-primary text-white text-sm font-bold rounded-md cursor-pointer']")
	WebElement add;



	void clickjoin() {
		join.click();
	}

	void creatorbutton() {
		creator.click();
	}

	void enteremail() {
		creatoremail.sendKeys("e59fcgw738@lettershield.com");
	}

	void enterpassword() {
		creatorpassword.sendKeys("Redskin0$");
	}

	void enterconfirm() {
		creatorconfirmpassword.sendKeys("Redskin0$");
	}

	void clickbox() {
		termsagreement.click();
	}

	void signup() {
		signupcreator.click();
	}

	void entername() {
		name.sendKeys("Johansson");
	}

	void enterlastname() {
		lastname.sendKeys("Kapperton");
	}

	void enterlocation() {
		location.clear();
		location.sendKeys("New York");
	}

	
	
	void enterusername() {
		int randomnumber = (int)( Math.random()*10000000 );  
		username.sendKeys("kappin_" + randomnumber);
	}
	


	void dropdown() {
		Select hearaboutus = new Select(driver.findElement(By.xpath("//select[@id='hearAboutUs']")));
		hearaboutus.selectByVisibleText("Tiktok");
	}

	void next() {
		nextbutton.click();
	}

	void enteremail1() {
		email1.sendKeys("r.kapur1776@gmail.com");
	}

	void enteremail2() {
		email2.sendKeys("r.kapur1776@gmail.com");
	}

	void enteremail3() {
		email3.sendKeys("rohankapur2012@gmail.com");
	}

	void emailnext() {
		emailnext.click();
	}

	void profilepic() throws InterruptedException {
		
		WebElement file = driver.findElement(By.id("image"));
		//file.click();
		//File uploadFile = new File("C:/Users/rohan/OneDrive/Documents/picture.jpg");
		 Thread.sleep(5000);
		 file.sendKeys("C:\\Users\\rohan\\OneDrive\\Documents\\picture.jpg");
		// file.sendKeys(uploadFile.getAbsoluteP3ath());

		//WebElement file = driver.findElement(By.cssSelector(".w-6.h-6.object-contain.absolute.-right-2.bottom-2.cursor-pointer"));
		//file.click();
		//file.sendKeys("C:\\Users\\rohan\\OneDrive\\Documents\\picture.jpg");
		
		// driver.findElement(By.cssSelector(".w-6.h-6.object-contain.absolute.-right-2.bottom-2.cursor-pointer")).sendKeys("C:\\Users\\rohan\\OneDrive\\Documents\\picture.jpg");
		 
	}
	
	void bannerpic() throws InterruptedException {
		WebElement fileInput = driver.findElement(By.id("banner"));
		Thread.sleep(4000);
		fileInput.sendKeys("C:\\Users\\rohan\\OneDrive\\Documents\\Apache_Maven_logo.svg.png");
		
	}
	
	void filenext()  {
		filenext.click();
	}
	
	void enterbio()  {
		bio.sendKeys("I am a creator");
	}
	
	void enterdate()  {
	driver.findElement(By.xpath("//input[@name='dob']")).click();
	}
	
	void bionext()  {
		bionext.click();
	}
	
	void gender() {
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		gender.selectByVisibleText("Female");
	}
	
	void enterlanguage() throws InterruptedException  {
		language.sendKeys("English");
		Thread.sleep(500);
		add.click();
		Thread.sleep(500);
		language.sendKeys("Pashto");
		add.click();
		Thread.sleep(500);
		language.sendKeys("Arabic");
		add.click();
		Thread.sleep(500);
	}

	void content() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Face Content']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='px-8 md:px-12 py-2 bg-black text-white font-bold rounded-md cursor-pointer']")).click();
	}
	
	void industries() throws InterruptedException   {
		driver.findElement(By.xpath("//button[normalize-space()='Health, Wellness, Fitness']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Food and Beverages']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='App & Tech']")).click();
	}
	
	void keywords() throws InterruptedException   {
		driver.findElement(By.xpath("//input[@placeholder='Type the language']")).sendKeys("QA");
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@class='w-max px-12 py-3 p-3 bg-primary text-white text-sm font-bold rounded-md cursor-pointer']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//input[@placeholder='Type the language']")).sendKeys("Entertainment");
		Thread.sleep(300);
	}
	
	void next3()   {
		driver.findElement(By.xpath("//div[@class='w-max px-8 md:px-12 py-2 bg-black text-white font-bold rounded-md cursor-pointer']")).click();
	}
	
	void previouswork()  {
		WebElement vids = driver.findElement(By.xpath("//*[contains(@d,'M256')]"));
		vids.sendKeys("C:\\Users\\rohan\\Downloads\\Snapinsta.app_video_46930198_893734695690091_8903734336858072657_n.mp4");
	}
}