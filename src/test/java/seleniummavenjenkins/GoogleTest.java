package seleniummavenjenkins;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver = null;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		ChromeOptions opt = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:/wd/hub"), opt);
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
