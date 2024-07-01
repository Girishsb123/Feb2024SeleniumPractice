package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		String nameFieldText = driver.findElement(By.id("input-email")).getAttribute("placeholder");
//		System.out.println(nameFieldText);
//		
//		String passFieldText = driver.findElement(By.id("input-password")).getAttribute("placeholder");
//		System.out.println(passFieldText);

		// get the input text from the field
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		String inputText = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(inputText);

		By eid = By.id("input-email");
		By pwd = By.id("input-password");

		ElementUtil eleUtil = new ElementUtil(driver);
		String attText = eleUtil.doElementGetAttribute(pwd, "placeholder");
		System.out.println(attText);

	}

	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
