package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	public WebDriver driver;

	public DashBoardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
				
	}
	
	//WLR
	
	By WorkLoadReportTab = By.id("topmenu_anchorTaskReport");
	
	
	
	public void clickonWorkLoadReportTab() {
		driver.findElement(WorkLoadReportTab).click();
	}
	
	
	
	
}
