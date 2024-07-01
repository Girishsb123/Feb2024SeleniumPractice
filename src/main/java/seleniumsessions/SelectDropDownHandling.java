package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	//dropdown - htmltag <Select> -- <Options>

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		//WebElement country = driver.findElement(By.xpath("//select"));
		
//		Select select = new Select(country);
//		select.selectByIndex(5);
//		Thread.sleep(2000);
//		select.selectByVisibleText("Brazil");
//		Thread.sleep(2000);
//		select.selectByValue("India");
		
		By country = By.xpath("//select");
		//doSelectDropDownByIndex(country, 3);
		//doSelectDropDownByVisibleText(country, "Australia");
		doSelectDropDownByValue(country, "Uganda");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator,int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator,String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectDropDownByValue(By locator,String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

}
