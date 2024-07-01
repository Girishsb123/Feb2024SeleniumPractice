package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		Actions act = new Actions(driver);

		act.sendKeys(driver.findElement(By.id("input-email")), "testautomation").perform();
		act.sendKeys(driver.findElement(By.id("input-password")), "test@123").perform();
		act.click(driver.findElement(By.xpath("//input[@value='Login']"))).perform();

		// click: Clicks in the middle of the given element. Equivalent to:// Actions.moveToElement(onElement).click()
	}
}
