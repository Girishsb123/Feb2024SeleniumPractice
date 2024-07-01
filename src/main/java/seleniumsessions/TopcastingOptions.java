package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopcastingOptions {

	public static void main(String[] args) {

		// valid + not recommended
		SearchContext driver2 = new ChromeDriver();

		// valid + recommended
		WebDriver driver = new ChromeDriver();

		// valid + recommended
		RemoteWebDriver driver1 = new ChromeDriver();

		// valid + not recommended
		ChromiumDriver driver3 = new ChromeDriver();

	}

}
