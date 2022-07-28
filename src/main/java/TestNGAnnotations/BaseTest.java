package TestNGAnnotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	@Parameters({ "browser", "url", "headless" })
	@BeforeTest
	public void setup(String browser, String url, String headless) {
		System.out.println("Launch Browser and URL");
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			if (headless.equals("yes")) {
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--headless");
 			}
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			if (headless.equals("yes")) {
				FirefoxOptions fo = new FirefoxOptions();
				fo.addArguments("--headless");
				driver = new FirefoxDriver(fo);

			}
		}
		
		
	}

	@AfterTest
	public void tearDown() {
		System.out.println("close browser");
		driver.quit();
	}

}
