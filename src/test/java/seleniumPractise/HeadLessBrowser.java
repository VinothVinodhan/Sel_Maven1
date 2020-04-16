package seleniumPractise;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLessBrowser {
	// Declaring and initialising the HtmlUnitWebDriver
	HtmlUnitDriver unitDriver = new HtmlUnitDriver();
	@Test
	public void browser() {
		System.out.println(unitDriver);
		// open google.com webpage
		unitDriver.get("http://google.com");

		System.out.println("Title of the page is -> " + unitDriver.getTitle());

	}
}