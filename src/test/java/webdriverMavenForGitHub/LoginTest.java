package webdriverMavenForGitHub;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\PS_QA\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
	
	}
	@AfterTest
	
	public void teardown() {
		driver.quit();
		
		
	}

}
