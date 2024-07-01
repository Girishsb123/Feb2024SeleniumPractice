package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=4061805960896500922&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302538&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");

		// Get total links and corresponding text of links
		List<WebElement> imageLists = driver.findElements(By.tagName("img"));
		
		//driver.findElements(By.tagName("img"));
		System.out.println("total no of images : " + imageLists.size());

//		for (WebElement e : imageLists) {
//			String altval = e.getAttribute("alt");
//			if (altval.length() != 0) {
//				System.out.println("Alt value" + "===" + altval);
//			}

		for (WebElement e : imageLists) {
			String srcval = e.getAttribute("src");
			if (srcval.length() != 0) {
				System.out.println("Src value" + "===" + srcval);
			}
		}
	}

}
