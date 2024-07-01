package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By country = By.id("Form_getForm_Country");

		// WebElement country_ele = driver.findElement(country);

		int countryCounts = getDropDownOptionsCount(country);
		System.out.println(countryCounts);

		if (getDropdownOptions(country).contains("srilanka")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		selectDropdownOptions(country, "India");
		selectDropdownOptions(country, "Togo");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		int count = select.getOptions().size();
		return count;
	}

	public static void selectDropdownOptions(By locator, String dropDownValue) {
		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {

			System.out.println(optionsList.size());

			String text = e.getText();
			if (text.contains(dropDownValue)) {
				e.click();
				break;
			}
		}
	}

	public static List<String> getDropdownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<String> optionsTextList = new ArrayList<String>();
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}

		return optionsTextList;
	}
}
