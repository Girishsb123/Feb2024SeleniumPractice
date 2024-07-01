package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

//		driver.findElement(
//				By.xpath("//a[text()='John.Smith']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		Thread.sleep(2000);

//		List<WebElement> colValues = driver
//				.findElements(By.xpath("(//a[text()='John.Smith']/parent::td/following-sibling::td)"));
//
//		for (WebElement e : colValues) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		selectUser("John.Smith");

		List<String> userDetails = getUserInfo("John.Smith");
		System.out.println(userDetails);
	}

	public static void selectUser(String userName) {
		driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserInfo(String userName) {
		List<WebElement> colEles = driver
				.findElements(By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td"));
		List<String> colValuesList = new ArrayList<String>();
		for (WebElement e : colEles) {
			String text = e.getText();
			colValuesList.add(text);
		}
		return colValuesList;
	}

}
