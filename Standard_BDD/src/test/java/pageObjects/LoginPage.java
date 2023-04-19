package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	
	By userName = By.id("Username");
	By userPassword = By.id("Password");
	By loginBtn = By.cssSelector("button[value='login']");
	By welcomeText = By.xpath("//*[@id=\\\"content\\\"]/div/div/div/div/div/div/div/div[1]/h3/text()[1]");
	By welcomeuserName = By.id("ctl00_ctl00_MainContent_MainContent_lblUserFirstName");
	
	

	public String getTitleLandingPage() {
		return driver.getTitle();
	}
	
	public void LoginintoApp() throws InterruptedException
	{
		driver.findElement(userName).sendKeys("limon.hossain");
		driver.findElement(userPassword).sendKeys("ll064evA1!4");
		driver.findElement(loginBtn).click();
		Thread.sleep(5000);
		
		
	}

}
