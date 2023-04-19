package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {

		// creating object of FileInputStream class
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		// result = testCondition ? value1 : value2

		String browser = browser_maven != null ? browser_maven : browser_properties;

		if (driver == null) {

			if (browser.equalsIgnoreCase("chrome")) {

				// Setting system properties of ChromeDriver
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");

				// add after 111 version throwing errors
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");

				// Creating an object of ChromeDriver
				driver = new ChromeDriver(options);// driver gets the life

			}

			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\limon.hossain\\eclipse-workspace\\libs\\geckodriver 5");

				driver = new FirefoxDriver();
			}
			// Specifiying pageLoadTimeout and Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			// launching the specified URL
			driver.get(url);
		}

		return driver;

	}

}
