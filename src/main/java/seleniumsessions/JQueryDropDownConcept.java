package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");

		Thread.sleep(2000);

		driver.findElement(By.id("justAnInputBox")).click();

		// 45 spans --> 15 spans
		List<WebElement> choicesList = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		for (WebElement e : choicesList) {
			String text = e.getText();
//			System.out.println(text);
//			if (text.contains("choice 2")) {
//				e.click();
//				break;
//			}
			
			try{
				e.click();
			}
			catch(ElementNotInteractableException ex) {
				System.out.println("drop down choices are over....");
				break;
			}
			
			
		}
		
		
		List<WebElement> eleList = driver.findElements(By.xpath("//h3[text()='Multi Selection']/following-sibling::div//span[@class='comboTreeItemTitle']"));
        System.out.println(eleList.size());
	}
}
