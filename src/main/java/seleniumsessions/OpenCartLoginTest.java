package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartLoginTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");

		// brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String email_id = "input-email";
//		String pwd_id = "input-password";
//		
//     	ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.dosendKeys("id", email_id, "tom@gmail.com");
//		eleUtil.dosendKeys("id", pwd_id, "tom@123");

//		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		String firstname = "input-firstname";
//		String lastname = "input-lastname";
//		String email = "input-email";
//		String telephone = "input-telephone";
//		String password = "input-password";
//		String confirmpassword = "input-confirm";
//
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.dosendKeys("id", firstname, "Girish");
//		eleUtil.dosendKeys("id", lastname, "sb");
//		eleUtil.dosendKeys("id", email, "Girishvjc1993@gmail.com");
//		eleUtil.dosendKeys("id", telephone, "8217863288");
//		eleUtil.dosendKeys("id", password, "test@123");
//		eleUtil.dosendKeys("id", confirmpassword, "test@123");

		brUtil.launchUrl(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T2&gad_source=1&gclid=CjwKCAjw9cCyBhBzEiwAJTUWNRTJ9U4VWRn4tA6O0w7hT0fM4Cm2_02s5CfkK3-_GyZ-rEswB_IZThoCEmQQAvD_BwE");

		By xpath = By.xpath("//button[text()='Login/ Sign Up']");
		// By tag = By.tagName("label");
		By xpath1 = By.xpath("//span[text()='Login/ Sign up']/following::input");

		By button = By.xpath("//button[text()='Continue']");

		By phone = By.xpath("//span[text()='Verify Mobile Number']/following::input");

		By vbtn = By.xpath("//button[text()='Verify Mobile Number']");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doClick(xpath);
		Thread.sleep(3000);
		eleUtil.dosendKeys(xpath1, "girishbabu.bs321@gmail.com");
		eleUtil.doClick(button);
		Thread.sleep(3000);
		eleUtil.dosendKeys(phone, "8892454158");
		eleUtil.doClick(vbtn);

		Thread.sleep(5000);

		driver.close();

	}

}
