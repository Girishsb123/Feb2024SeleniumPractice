package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSession {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bigbasket.com/");
//
//		System.out.println(driver.getTitle());
//
//		driver.quit();

		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());//Session ID is null. Using WebDriver after calling quit()?
		
		driver.close();
		
		driver.getTitle();//invalid session id

	}

}
