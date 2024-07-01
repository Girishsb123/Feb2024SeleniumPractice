package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		List<WebElement> textFieldLists = driver.findElements(By.className("form-control"));
//		System.out.println("total no of text fields are : " + textFieldLists.size());// 7

		By linksList = By.xpath("//a[@class='list-group-item']");
		doClickOnElement(linksList, "Reward Points");

	}

	public static void doClickOnElement(By locator, String eleText) {
		// total links text
		List<WebElement> linksList = driver.findElements(locator);
		System.out.println(linksList.size());

		for (WebElement e : linksList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(eleText)) {
				e.click(); //getting stale element exception - check later
				// break;
			}

		}
	}

}
