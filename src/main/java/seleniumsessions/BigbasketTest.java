package seleniumsessions;

public class BigbasketTest {

	public static void main(String[] args) {
		// https://www.bigbasket.com/

		BrowserUtil bUtil = new BrowserUtil();
		// bUtil.driver.get("https://www.bigbasket.com/");//NPE - We need to make driver
		// as private so that no one can access from outside of the browser class

		bUtil.launchBrowser("Chrome ");
		bUtil.launchUrl(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T2&gad_source=1&gclid=CjwKCAjw9cCyBhBzEiwAJTUWNRTJ9U4VWRn4tA6O0w7hT0fM4Cm2_02s5CfkK3-_GyZ-rEswB_IZThoCEmQQAvD_BwE");

		String actTitle = bUtil.getPageTitle();
		if (actTitle.equals("Online Grocery Shopping and Online Supermarket in India - bigbasket")) {
			System.out.println("title is correct -- pass");
		} else {
			System.out.println("title is incorrect -- fail");
		}

		String actUrl = bUtil.getPageCurrentUrl();
		if (actUrl.equals(
				"https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T2&gad_source=1&gclid=CjwKCAjw9cCyBhBzEiwAJTUWNRTJ9U4VWRn4tA6O0w7hT0fM4Cm2_02s5CfkK3-_GyZ-rEswB_IZThoCEmQQAvD_BwE")) {
			System.out.println("Url is correct -- pass");
		} else {
			System.out.println("Url is incorrect -- fail");
		}

		boolean flag = bUtil.getPageSource("fruits and vegetables");
		System.out.println(flag);

		bUtil.close();

	}

}
