package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// driver.findElement(By.id("input-email11")).sendKeys("test@gmail.com");NoSuchElementException

		int total = 123;
		String totalbill = String.valueOf(total);
		// driver.findElement(By.id("input-email")).sendKeys(totalbill);

		// driver.findElement(By.id("input-email")).sendKeys(null);
		// java.lang.IllegalArgumentException: Keys to send should be a not null
		// CharSequence

		StringBuilder sb = new StringBuilder("test@gmail.com");
		driver.findElement(By.id("input-email")).sendKeys(sb);

		// CharSequence - Interface <- string, stringbuffer, stringbuilder

	}

}
