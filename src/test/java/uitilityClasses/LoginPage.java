package uitilityClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws Throwable {
		By email = By.id("user-name");
		By loginbutton = By.id("login-button");
		By password = By.id("password");
		By header = By.xpath("//span[@class='title']");
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchURL("https://www.saucedemo.com/");
//		String title = br.dogetTitle();
//		System.out.println(title);

		Element e1 = new Element(driver);
		e1.doSendKeys(email, "standard_user");
		e1.doSendKeys(password, "secret_sauce");
		e1.doClick(loginbutton);
		Thread.sleep(3000);
		String title = br.dogetTitle();
		System.out.println(title);
		String headerofPage = e1.doGetText(header);
		if (headerofPage.equals("PRODUCTS")) {

			System.out.println("Page Header is:"+ headerofPage);

		} else {
			System.out.println("Incorrect Page Header");
		}
		br.quitBrowser();

	}

}
