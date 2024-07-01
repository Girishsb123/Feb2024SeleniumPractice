package seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunctions {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By links = By.tagName("a");
		By images = By.tagName("img");
		
		By cartLinks = By.className("list-group-item");
//
//		List<WebElement> linkcount = getElements(links);
//		System.out.println(linkcount.size());
//
//		List<WebElement> imagescount = getElements(images);
//		System.out.println(imagescount.size());
//
//		List<String> actualLinksTextList = getElementsTextList(links);
//		System.out.println(actualLinksTextList);
//
//		if (actualLinksTextList.contains("MacBook")) {
//			System.out.println("MacBook --- PASS");
//		}
//
//		System.out.println(Arrays.asList(actualLinksTextList));

		List<String> hrefList = getElementsAttributeList(links, "href");
		for(String e : hrefList) {
			System.out.println(e);
		}
	}

	// WAF : capture the text of all the page links and return List<String>.
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// pc = 0
		for (WebElement e : eleList) {
			String text = e.getText();

			if (text.length() != 0) {
				eleTextList.add(text);
			}

		}

		return eleTextList;
	}

	// WAF: capture specific attribute from the list:
	public static List<String> getElementsAttributeList(By locator, String attrName) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleAttrList = new ArrayList<String>();// pc = 0
		for (WebElement e : eleList) {
			String attrValue = e.getAttribute(attrName);
			eleAttrList.add(attrValue);
		}
		
		return eleAttrList;
		
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
