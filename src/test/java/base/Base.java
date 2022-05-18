package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.WebDriverList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.HomePage;

public class Base extends WebDriverList {
	public WebDriver driver;
	public HomePage homePage;

	public void WebDriverManager() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();

	}

	public WebDriver getDriver() {
		return driver;
	}

	public HomePage getHomePage() {
		this.homePage = new HomePage(driver);

		return homePage;
	}

	public void WebDriverQuit() {
		driver.quit();
	}

}
