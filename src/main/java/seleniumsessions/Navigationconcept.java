package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationconcept {

	// get() and to() both are same but to() are overloaded i.e the only difference
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.myntra.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.close();

	}

}
