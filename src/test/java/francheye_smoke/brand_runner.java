package francheye_smoke;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brand_runner {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driverr = new ChromeDriver();
		driverr.get("https://francheye.vercel.app/");
		driverr.manage().window().maximize();
		driverr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		brand_account_creation driver2 = new brand_account_creation(driverr);
		
		driver2.Join();
		Thread.sleep(300);
		driver2.Company();
		

	}

}
