package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {

		// Webelement
		// Create webelement + perform action(click,sendkeys,getText,isDisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String email_id = "input-email";
		String pwd_id = "input-password";
		String btn_xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input";
		String register_link = "Register";

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.dosendKeys("id", email_id, "test@gmail.com");
		eleUtil.dosendKeys("id", pwd_id, "test@123");
		eleUtil.doClick("xpath", btn_xpath);

		String registerValue = eleUtil.doElementgetText("linktext", register_link);
		System.out.println(registerValue);

	}

}
