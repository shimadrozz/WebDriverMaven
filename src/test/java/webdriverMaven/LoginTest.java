package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("shimadrozz@gmail.com");
		//driver.findElement(By.id("Passwrd")).sendKeys("sfsfsfsf");
		driver.findElement(By.id("SignIn")).click();
	}
	
	@AfterSuite
	public void TearDown() {
		
		driver.quit();

	}

}
