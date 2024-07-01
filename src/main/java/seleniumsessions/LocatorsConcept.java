package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// 1.id : is an attribute : unique
		// driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");

		// 2.name : is an attribute : can be duplicate
		// driver.findElement(By.name("email")).sendKeys("test@gmai.com");

		// 3.classname : is an attribute : can be duplicate
		// driver.findElement(By.className("form-control")).sendKeys("test@gmai.com");

		// 4.xpath : this is the address of the element
		// driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");

//		By eid = By.id("input-email");
//		By pwd = By.id("input-password");
//		By btn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");

		// 5.cssSelector :
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();

//		By eid = By.cssSelector("#input-email");
//		By pwd = By.cssSelector("#input-password");
//		By loginbtn = By.cssSelector("#content > div > div:nth-child(2) > div > form > input");

		// 6.partial link text : it is not an attribute & can be duplicate ,this is text
		// of the element
		// Represented by html tag <a> anchor tag

		// driver.findElement(By.partialLinkText("Forgotten")).click();

		// 7.Link text : it is not an attribute & can be duplicate ,this is text
		// of the element
		// Represented by html tag <a> anchor tag

		// driver.findElement(By.linkText("Forgotten Password")).click();

		// 8.Tag name

//		String header = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);

//		if(header.equals("New Customer")) {
//			System.out.println("header is correct -- PASS");
//		}else {
//			System.out.println("FAIL");
//		}

		By headerValue = By.tagName("h2");

		String headertext = doElementgetText(headerValue);
		System.out.println(headertext);

		if (headertext.equals("New Customer")) {
			System.out.println("header is correct -- PASS");
		} else {
			System.out.println("FAIL");
		}

//
//		dosendKeys(eid, "test@gmail.com");
//		dosendKeys(pwd, "test@123");
//		doClick(loginbtn);

	}

	public static void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();

	}

	public static String doElementgetText(By locator) {
		return getElement(locator).getText();
	}

}
