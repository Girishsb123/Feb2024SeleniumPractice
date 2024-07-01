package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCrmWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//classic CRM:
				//a[text()='David Rodriguez']/parent::td/preceding-sibling::td/input[@type='checkbox']
				//a[text()='David Rodriguez']/parent::td//following-sibling::td/a[@context='company']
		
		//driver.findElement(By.xpath("//a[text()='David Rodriguez']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		selectUser("David Rodriguez");
		
		String company = getUserCompany("David Rodriguez");
		System.out.println(company);
	}
	
	public static void selectUser(String userName) {
		
		driver.findElement(By.xpath(("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))).click();
		
	}
	
	public static String getUserCompany(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//following-sibling::td/a[@context='company']")).getText();
	}

}
