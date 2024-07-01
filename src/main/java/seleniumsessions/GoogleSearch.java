package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//
//		Thread.sleep(3000);
//
//		List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
//
//		System.out.println(suggList.size());
//
//		for (WebElement e : suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("testing jobs")) {
//				e.click();
//				break;
//			}
//		}

		By searchField = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		
		googleSearch(searchField, suggestions, "Selenium Automation", "testing jobs");
		

	}

	public static void googleSearch(By searchField, By suggestions, String searchKey, String suggName)
			throws InterruptedException {

		//driver.findElement(By.name("q")).sendKeys("Selenium Automation");
		driver.findElement(searchField).sendKeys(searchKey);
		

		Thread.sleep(3000);

		//List<WebElement> suggList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		List<WebElement> suggList = driver.findElements(suggestions);
		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			//if (text.contains("testing jobs")) {
			if (text.contains(suggName))
				e.click();
				break;
			}
		}
	}

