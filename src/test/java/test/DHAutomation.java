package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class DHAutomation {
	static MobileDriver driver;

	@Test(priority = 1)
	public void mobileSide() throws MalformedURLException, InterruptedException {
		// WebDriverWait wait = new WebDriverWait(driver, 60);
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "CB5A20X5AA");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "6.0.1");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.att.dh");
		capabilities.setCapability("app", "C://Users//manju//Desktop//Selenium//Appium//Test apk//DH_appiumTest.apk");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.DeviceHelpHome");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.DeviceHelpHome");
		capabilities.setCapability("newCommandTimeout", 100);

		// com.aetherpal.remotecontrol.dialogs.Authentication
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver(url, capabilities);
		System.out.println("Hello the app started.");
		Thread.sleep(15000);

		String Title1 = driver.findElement(By.xpath("//android.view.View[@content-desc='AT&T Device Help']")).getText();
		System.out.println(Title1);
		Thread.sleep(1000);

		String Storage = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.Button"))
				.getText();
		System.out.println(Storage);

		String Connectivity = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button"))
				.getText();

		System.out.println(Connectivity);

		String OS = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.Button"))
				.getText();
		System.out.println(OS);

		String Battery = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.widget.Button"))
				.getText();
		System.out.println(Battery);
		/*
		 * // Search function // String WaterMark = //
		 * driver.findElement(By.id("home_searchTxt_input")).getText(); //
		 * System.out.println(WaterMark);
		 * 
		 * driver.findElement(By.id("home_searchTxt_input")).sendKeys("at");
		 * driver.findElement(By .xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button"
		 * )) .click();
		 * 
		 * //
		 * driver.findElement(By.xpath("//*[@id='home_search_box']/span")).click
		 * (); Thread.sleep(3000); String searchtitle =
		 * driver.findElement(By.id("heading_txt")).getText();
		 * System.out.println("Your search result title is: " + searchtitle);
		 * 
		 * try { String NoResult =
		 * driver.findElement(By.xpath("//*[@id='search_no_list']/li")).getText(
		 * ); System.out.println(NoResult);
		 * System.out.println("Invalid Key search");
		 * 
		 * } catch (Exception e) { // to Print search results List<WebElement>
		 * SearchResults = driver.findElements(By.id("search_other_list")); for
		 * (WebElement SR : SearchResults) { System.out.println(SR.getText());
		 * 
		 * } }
		 * 
		 * driver.findElement(By.id("back_arrow")).click(); Thread.sleep(4000);
		 */
	}

	public void storage() throws InterruptedException {

		WebElement StorageLink = driver.findElement(By.id("storagePage_link"));
		StorageLink.click();
		Thread.sleep(5000);
		System.out.println("Wait for sometime to load storage page");

		// String PermissionText =
		// driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).getText();
		// System.out.println(PermissionText);

		// WebElement AllowButton =
		// driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		// AllowButton.click();

		String Title2 = driver.findElement(By.id("heading_txt")).getText();
		System.out.println(Title2);

		try {
			String Heading = driver.findElement(By.id("storageremaning")).getText();
			System.out.println("Your Storage status is: " + Heading);

			String BlueCardText = driver.findElement(By.id("bluecard_text")).getText();
			System.out.println(BlueCardText);

		} catch (Exception e) {
			System.out.println("Wait for sometimes to load Stroage page");

		}

		try {
			String TempFiles = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[3]/android.view.View[1]/android.view.View/android.view.View/android.view.View"))
					.getText();
			System.out.println(TempFiles);

			WebElement icon = driver.findElement(By.id("tempfiles_popup"));
			icon.click();
			System.out.println("Temporary i icon clicked");
			Thread.sleep(1000);

			String text = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View"))
					.getText();
			System.out.println(text);

			driver.findElement(By.id("tempfiles_info_close")).click();
		}

		catch (Exception e) {
			System.out.println("Currently no Temp Files");
		}
	}

	@Test(priority = 2)
	public void OSAPPS() throws InterruptedException {

		String OS = driver.findElement(By.id("os_apps_link")).getText();
		System.out.println(OS);
		driver.findElement(By.id("os_apps_link")).click();
		// function on permission window

		/*
		 * driver.findElement(By.id("os_apps_link")).click(); String message =
		 * driver.findElement(By.id(
		 * "com.android.packageinstaller:id/permission_message")).getText();
		 * System.out.println(message); //driver.findElement(By.id(
		 * "com.android.packageinstaller:id/permission_allow_button")).click();
		 * System.out.println("Clicked on Allow");
		 */
		System.out.println("Wait for 5 seconds to load");
		String title = driver.findElement(By.id("heading_txt")).getText();
		System.out.println("OS and apps page title is " + title);
		Thread.sleep(10000);

		try {
			String Status = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View"))
					.getText();
			System.out.println(Status);
			String CardText = driver.findElement(By.id("bluecard_text")).getText();
			System.out.println(CardText);

			// Elements

			// 1st element
			try {
				String Storage = driver
						.findElement(By
								.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View"))
						.getText();
				System.out.println(Storage);
			} catch (Exception e) {
				System.out.println("Storage no alert");
			}

			// 2nd element
			try {
				String apps = driver
						.findElement(By
								.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View"))
						.getText();
				System.out.println(apps);
			} catch (Exception e) {
				System.out.println("No Running apps");
			}
			// 3rd element
			try {
				String temp = driver
						.findElement(By
								.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View"))
						.getText();
				System.out.println(temp);
				driver.findElement(By.id("tempfiles_popup")).click();
				System.out.println("i icon clicked");

				String tempinfo = driver.findElement(By.id("P1")).getText();
				System.out.println(tempinfo);
				driver.findElement(By.id("tempfiles_info_close")).click();

			} catch (Exception e) {
				System.out.println("Temp files are not available");
			}

			// 4
			WebElement AndroidUpdate = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View"));
			String Fourth = AndroidUpdate.getText();
			System.out.println("4th element is" + Fourth);
			AndroidUpdate.click();
			String AndroidInfo = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[4]/android.view.View[2]/android.view.View"))
					.getText();
			System.out.println(AndroidInfo);

			// 5th element
			WebElement appUpdate = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View"));
			String Fifth = appUpdate.getText();
			System.out.println("5th element is " + Fifth);
			appUpdate.click();
			String appinfo = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[5]/android.view.View[2]/android.view.View"))
					.getText();
			System.out.println(appinfo);

			// need more help
			WebElement NeedMore = driver.findElement(By.id("need_more_help"));
			String Need = NeedMore.getText();
			System.out.println("Link present at the bottom is " + Need);
			NeedMore.click();

			String NeedInfo = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[1]"))
					.getText();
			System.out.println(NeedInfo);

			WebElement NeedInfoFirst = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[2]"));
			String textone = NeedInfoFirst.getText();
			System.out.println(textone);

			String textoneinfo = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[3]/android.view.View"))
					.getText();
			System.out.println(textoneinfo);

			WebElement NeedInfoSecond = driver.findElement(By.xpath(
					"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[4]"));
			String texttwo = NeedInfoSecond.getText();
			System.out.println(texttwo);
			NeedInfoSecond.click();
			String textsecondinfo = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View[5]"))
					.getText();
			System.out.println(textsecondinfo);

			String FirstLink = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button[1]"))
					.getText();
			System.out.println("First guide link name is " + FirstLink);

			String SecondLink = driver
					.findElement(By
							.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.Button[2]"))
					.getText();
			System.out.println("Second guide link name is " + SecondLink);

		}

		catch (

		Exception e) {
			System.out.println("OS and Apps page taking more than 5 seconds to load. Please close and relaunch it");
		}

	}

}