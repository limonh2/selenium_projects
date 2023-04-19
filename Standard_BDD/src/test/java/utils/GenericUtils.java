package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class GenericUtils {
	public WebDriver driver;
	private WebDriverWait wait;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;

	}

	public void switchToIframe(By locator) {
        driver.switchTo().frame(waitForPresenceOfElement(locator));
    }
	
	public void switchToIframe(WebElement locator) {
        driver.switchTo().frame(locator);
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }
    
    public WebElement waitForPresenceOfElement(By loc) {
    	wait = new WebDriverWait(this.driver, Duration.ofSeconds(60), Duration.ofSeconds(1));
		WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		return element;
    }
	
	public void switchToParentWindow(String title) {

//		windowControl.closeWindow();
		// windowControl.switchToNewWind(title);
	}

	public void SwitchWindowToChild() {
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		// String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

	public void waitforElementToBePresent() {

	}

	public void waitForNewWindowToLoad() throws InterruptedException {
		int size = driver.getWindowHandles().size();
		int cnt = 0;
		while (size < 2) {
			cnt++;
			wait(2);
			size = driver.getWindowHandles().size();
			if (cnt >= 45) {
				break;
			}
		}
	}

	public WebElement waitForVisibilityOfElement(WebElement ele) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(60), Duration.ofSeconds(1));
		WebElement element = null;
		element = wait.until(ExpectedConditions.visibilityOf(ele));
		return element;

	}

	// public void claimaintQuickSearch(String claim) {
//driver.findElement(DashboardClaimantquickSearch)	}

	public void switchToNewWind2(String titlePrefix) {
		Set<String> winds = driver.getWindowHandles();
		for (String win : winds) {

			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (!title.startsWith(titlePrefix)) {
				break;
			}
		}

	}

	public void switchToNewWind(String titlePrefix) {
		Set<String> winds = driver.getWindowHandles();
		for (String win : winds) {

			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.startsWith(titlePrefix)) {
				break;
			}
		}
	}

	public void closeCurrentWindow() {
		driver.close();
	}

	public void waitFor(double sec) {
		try {
			if (sec < 0 || sec > 500) {
				throw new IllegalArgumentException("Wait is specified is greater than 500 sec.");
			}
			Thread.sleep((long) (sec * 1000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
