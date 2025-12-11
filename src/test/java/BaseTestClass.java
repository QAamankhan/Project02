

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void init() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito","--disable-notifications","--start-maximized");
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	
}
