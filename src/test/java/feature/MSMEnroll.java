package feature;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class MSMEnroll {

	By login = By.id("loginUser");
	By text = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]");
	By loginbutton = By.id("login_btn");
	By FirstPermission = By.id("com.android.packageinstaller:id/permission_message");
	By FirstAllow = By.id("com.android.packageinstaller:id/permission_allow_button");
	By SecondPermission = By.id("com.android.packageinstaller:id/permission_message");
	By SecondAllow = By.id("com.android.packageinstaller:id/permission_allow_button");

	By AccessibilityTitle = By.id("android:id/alertTitle");
	By AccessibilityText = By.id("com.aetherpal.enterprise:id/dialogText");
	By EnableButton = By.id("android:id/button1");

	// Accessibility page
	By MobSupport = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
	By ToggleButton = By.id("com.android.settings:id/switch_widget");
	By OkButton = By.id("android:id/button1");

	@Test
	public void accessibilityExample() throws InterruptedException, IOException {

		// Mobile
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "LGH931391140be");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "8.0.0");
		capabilities.setCapability("noReset", false);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("dontStopAppOnReset", false);
		capabilities.setCapability("newCommandTimeout", 0);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		MobileDriver driver = new AndroidDriver(url, capabilities);
		System.out.println("Hello the app started.");
		System.out.println(driver.findElement(text).getText());

		driver.findElement(login).sendKeys("gmqars");

		// Enrolling qagm

		driver.findElement(loginbutton).click();
		Thread.sleep(15000);
		System.out.println("10 sec waited");

		// Logged in
		System.out.println(driver.findElement(FirstPermission).getText());
		driver.findElement(FirstAllow).click();
		System.out.println(driver.findElement(SecondPermission).getText());
		driver.findElement(SecondAllow).click();
		System.out.println(driver.findElement(AccessibilityTitle).getText());
		System.out.println(driver.findElement(AccessibilityText).getText());
		driver.findElement(EnableButton).click();
		Thread.sleep(1000);

		// swipe till down
		int durationMS = 4000;
		Dimension size = driver.manage().window().getSize();
		for (int i = 0; i <= 2; i++) {
			int startx = size.width / 2;
			System.out.println(size);
			int starty = (int) (size.height * 0.60);
			int endy = (int) (size.height * 0.10);
			driver.swipe(startx, starty, startx, endy, durationMS);
			System.out.println(i);
		}

		// Turnning ON Accessibility
		driver.findElement(MobSupport).click();
		driver.findElement(ToggleButton).click();
		driver.findElement(OkButton).click();

		// Coming back to MSM
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);

		// MSM
		System.out.println(driver.findElement(By.id("android:id/alertTitle")).getText());
		driver.findElement(By.id("android:id/button1")).click();

		// Clicking Footer
		driver.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Remote Control button clicked");
		Thread.sleep(2000);

	}
}