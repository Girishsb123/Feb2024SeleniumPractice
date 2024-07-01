package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		// Webelement
		// Create webelement + perform action(click,sendkeys,getText,isDisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1st approach :
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		// 2nd approach :
//		WebElement emailid = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailid.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");

		// 3rd approach : By locator

//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		WebElement email_id = driver.findElement(eid);
//		WebElement pword = driver.findElement(pwd);
//
//		email_id.sendKeys("test@gmail.com");
//		pword.sendKeys("test@123");

		// 4th approach : By locator + generic method for element

//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		getElement(eid).sendKeys("test@gmail.com");
//		getElement(pwd).sendKeys("test@123");

		// 5th approach : By locator + generic method for element and action

//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//
//		dosendKeys(eid, "test@gmail.com");
//		dosendKeys(pwd, "test@123");

//		//6th: By locator + generic method for element and action in other element util class
//		
//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.dosendKeys(eid, "test@gmail.com");
//		eleUtil.dosendKeys(pwd, "test@123");

		// 7th: BrowserUtil + ElementUtil

		// 8th: By locators --> String locators
//		By eId = By.id("input-email");
//		By pwd = By.id("input-password");

		String email_id = "input-email";
		String pwd_id = "input-password";

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.dosendKeys("id", email_id, "tom@gmail.com");
		eleUtil.dosendKeys("id", pwd_id, "tom@123");

		// 9th: POM + framework

		// driver.close();

	}

	public static void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
