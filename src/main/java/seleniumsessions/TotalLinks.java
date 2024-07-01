package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=4061805960896500922&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302538&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

		// Get total links and corresponding text of links
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));
		System.out.println("total no of links : " + linkLists.size());

//		for (int i = 0; i < linkLists.size(); i++) {
//			String text = linkLists.get(i).getText();
//			if (text.length() != 0) {
//				System.out.println(i + "==" + text);
//			}
//			
		for (WebElement e : linkLists) {
			String text = e.getText();
			if (text.length() != 0) {
				String hrefVal = e.getAttribute("href");
				System.out.println(text + "===" + hrefVal);
			}
		}

	}

}
