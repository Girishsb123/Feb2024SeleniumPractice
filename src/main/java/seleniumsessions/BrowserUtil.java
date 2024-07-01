package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to launch the browser
	 * 
	 * @param browserName
	 * @return Current Driver Instance
	 */

	public WebDriver launchBrowser(String browserName) {

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Chrome is launched");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.out.println("ff is launched");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println("edge is launched");
			driver = new EdgeDriver();
			break;
		case "safari":
			System.out.println("safari is launched");
			break;

		default:
			System.out.println("Plz pass the right browser : " + browserName);
			throw new AppException("INVALID BROWSER : " + browserName);
		}

		return driver;

	}

	/**
	 * this method is used to launch Url
	 * 
	 * @param Url
	 */

	public void launchUrl(String Url) {

		// null Check
		if (Url == null) {
			System.out.println("URL IS NULL");
			throw new AppException("NULL URL");
		}

		// http == indexOf
		if (Url.indexOf("http") == 0) {
			try {
				driver.get(Url);
			} catch (Exception e) {
				System.out.println("HTTP is missing");
			}
		} else {
			System.out.println("HTTP is missing");
			throw new AppException("HTTP is missing");

		}

	}

	/**
	 * this method is used to get the pageTitle
	 * 
	 * @return title of the page
	 */

	public String getPageTitle() {
		String actTitle = driver.getTitle();
		System.out.println("Page title is : " + actTitle);
		return actTitle;
	}

	/**
	 * this method is used gto get the currentUrl
	 * 
	 * @return currentUrl
	 */
	public String getPageCurrentUrl() {
		String actUrl = driver.getCurrentUrl();
		System.out.println("Page Url is : " + actUrl);
		return actUrl;

	}

	/**
	 * this method is used to get the pagesource
	 * 
	 * @param value
	 * @return pagesource
	 */

	public boolean getPageSource(String value) {
		String sourceValue = driver.getPageSource();
		if (sourceValue.contains(value)) {
			return true;
		}
		return false;
	}

	/**
	 * this method is used to close the current active browser instance
	 */

	public void close() {
		driver.close();
	}

	/**
	 * this method is used to close all the active browser instance
	 */

	public void quit() {
		driver.quit();
	}

}
