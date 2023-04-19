package stepDefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogicsSteps {
	
	public WebDriver driver;
	@Given("^Landing page of amazon$")
    public void landing_page_of_amazon() throws Throwable {
       
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		System.setProperty("webdriver.chrome.driver",
				("C:\\Users\\limon.hossain\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exee"));

		driver.get("https://www.saucedemo.com");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
    }
	
	 @Then("^Get all links count$")
	    public void get_all_links_count() throws Throwable {
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 int linkcount = links.size();
		 
		 System.out.println("Number of links are "+linkcount);
		 
	        
	    }

	    @Then("^Print all links$")
	    public void print_all_links() throws Throwable {
	        
	    }
}
