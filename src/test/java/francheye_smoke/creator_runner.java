package francheye_smoke;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class creator_runner {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://francheye.vercel.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		creator_account_creation driver1 = new creator_account_creation(driver);
		
		driver1.clickjoin();
		Thread.sleep(300);
		driver1.creatorbutton();
		Thread.sleep(300);
		driver1.enteremail();
		Thread.sleep(300);
		driver1.enterpassword();
		Thread.sleep(300);
		driver1.enterconfirm();
		Thread.sleep(300);
		driver1.clickbox();
		Thread.sleep(200);
		driver1.signup();
		Thread.sleep(15000);
		driver1.entername();
		Thread.sleep(200);
		driver1.enterlastname();
		Thread.sleep(200);
		driver1.enterlocation();
		Thread.sleep(2000);
		driver1.enterusername();
		Thread.sleep(1500);
		driver1.dropdown();
		Thread.sleep(2000);
		driver1.next();
		Thread.sleep(2000);
		//driver1.enteremail1();
		//Thread.sleep(800);
		//driver1.enteremail2();
		//Thread.sleep(800);
		//driver1.enteremail3();
		//Thread.sleep(800);
		driver1.emailnext();
		Thread.sleep(10000);
		driver1.profilepic();
		Thread.sleep(5000);
		driver1.bannerpic();
		Thread.sleep(800);
		driver1.filenext();
		Thread.sleep(200);
		driver1.enterbio();
		Thread.sleep(200);
		driver1.enterdate();
		Thread.sleep(4000);
		driver1.bionext();
		driver1.gender();
		Thread.sleep(200);
		driver1.enterlanguage();
		Thread.sleep(500);
		driver1.content();
		Thread.sleep(300);
		driver1.industries();
		Thread.sleep(300);
		driver1.keywords();
		Thread.sleep(300);
		driver1.next3();
		Thread.sleep(300);
		driver1.previouswork();
		 
	
		
	

	}

}
