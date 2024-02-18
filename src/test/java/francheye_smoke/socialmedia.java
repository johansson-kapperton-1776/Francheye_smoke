package francheye_smoke;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class socialmedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://francheye.vercel.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		smoke_element driver1 = new smoke_element(driver);
		
		driver1.clickjoin();
		driver1.creatorbutton();
		driver1.enteremail();
		driver1.enterpassword();
		driver1.enterconfirm();
		driver1.clickbox();
		driver1.signup();
		
		

		

	}

}
