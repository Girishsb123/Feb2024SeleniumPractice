package seleniumsessions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By footerList = By.xpath("//footer//a");

		ElementUtil eleUtil = new ElementUtil(driver);
		int count = eleUtil.getElementsCount(footerList);
		System.out.println(count);

		List<String> actFooterTextList = eleUtil.getElementsTextList(footerList);
		System.out.println(actFooterTextList);

		List<String> expectedList = Arrays.asList("About Us", "Returns", "Specials", "OpenCart");

		if (actFooterTextList.containsAll(expectedList)) {
			System.out.println("imp List are there --- Pass");
		}

//		List<WebElement> footerLinkLists = driver.findElements(footerList);
//		System.out.println(footerLinkLists.size());
//
//		for (WebElement e : footerLinkLists) {
//			String text = e.getText();
//			System.out.println(text);
//		}
	}

}
