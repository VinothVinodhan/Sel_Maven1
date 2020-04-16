package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Swipe_Example {
	@Test
	public void tpToBottom() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "CB5A20X5AA");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "6.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", true);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("app", "C:/Users/manju/Desktop/apk/AP_MS_142_3550.apk");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("newCommandTimeout", 0);

		// com.aetherpal.remotecontrol.dialogs.Authentication
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		MobileDriver driver = new AndroidDriver(url, capabilities);
		/*
		 * int durationMS = 4000; Dimension size =
		 * driver.manage().window().getSize(); for (int i = 0; i <= 5; i++) {
		 * int startx = size.width / 2; System.out.println(size); int starty =
		 * (int) (size.height * 0.60); int endy = (int) (size.height * 0.10);
		 * driver.swipe(startx, starty, startx, endy, durationMS);
		 * System.out.println(i); }
		 */

		// Below command is from Login
/*		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//android.widget.EditText[@content-desc='Company ID/Server Address/Email Address']")).click();
		driver.findElement(
				By.xpath("//android.widget.EditText[@content-desc='Company ID/Server Address/Email Address']"))
				.sendKeys("gmqars");
		Thread.sleep(2000);
		driver.findElement(By.id("login_btn")).click();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement phone = driver.findElement(By.id("com.android.packageinstaller:id/permission_message"));
		wait.until(ExpectedConditions.visibilityOf(phone));
		String phonetext = driver.findElement(By.id("com.android.packageinstaller:id/permission_message")).getText();
		System.out.println(phonetext);

		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		String text1 = driver.findElement(By.id("android:id/alertTitle")).getText();
		System.out.println(text1);
		driver.findElement(By.id("android:id/button1")).click();

		driver.findElement(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[1]"))
				.click();
		driver.findElement(By.id("com.android.settings:id/switch_widget")).click();
		driver.findElement(By.id("android:id/button1")).click();

		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);

		driver.findElement(By.id("android:id/button1")).click();
*/
		
		Thread.sleep(5000);
		driver.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Remote Control button clicked");
		Thread.sleep(2000);

		
	}
}