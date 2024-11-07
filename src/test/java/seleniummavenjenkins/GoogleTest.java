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
		System.out.println(1);
		ChromeOptions opt = new ChromeOptions();
		System.out.println(2);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), opt);
		System.out.println(3);
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
