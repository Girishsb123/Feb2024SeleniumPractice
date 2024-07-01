package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverbasics {

	public static void main(String[] args) {

		// 1.launchbrowser
		// 2.launchurl
		// 3.get title
		// 4.verify titile
		// 5.close browser

		// Automation test scripts
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		String actTitle = driver.getTitle();
		if (actTitle.equals("Google")) {
			System.out.println("title is correct -- pass");
		} else {
			System.out.println("title is incorrect -- fail");
		}

		driver.close();

	}

}
