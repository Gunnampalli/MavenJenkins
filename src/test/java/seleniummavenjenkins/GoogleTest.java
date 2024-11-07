package seleniummavenjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver = null;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}

	@Test
	public void validateTitle() {
		Assert.assertEquals(driver.getTitle(), "Google");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
