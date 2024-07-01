package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By langLinks = By.xpath("//div[@id='SIvCob']/a");
		clickOnElement(langLinks , "ಕನ್ನಡ");

		
	}
	
	public static void clickOnElement(By locator,String eleText) {
		//List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		List<WebElement> langLinks = driver.findElements(locator);
		System.out.println(langLinks.size());

		for (WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);

			if (text.contains(eleText)) {
				e.click();
				break;
			}
		}

	}

}
