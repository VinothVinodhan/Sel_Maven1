package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class LaunchApp {

	@Test
	public void test() throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = DesiredCapabilities.android();

		capabilities.setCapability("deviceName", "CB5A20X5AA");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "6.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("app", "C:/Users/manju/Desktop/apk/AP_MS_142_3550.apk");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		MobileDriver driver = new AndroidDriver(url, capabilities);
		System.out.println("Hello the app started.");
		Thread.sleep(10000);

/*		// Login
		driver.findElement(By.id("loginUser")).sendKeys("gmqars");
		driver.findElement(By.id("login_btn")).click();
		Thread.sleep(20000);

		// Permission Allow
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);

		// Accessibility
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Mobile Support")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.settings:id/switch_widget")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(1000);

		// Clicking back
		driver.findElement(By.className("android.widget.ImageButton")).click();
		Thread.sleep(5000);
*/
		driver.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Clicked on.");

		// Taking Device ID
		WebElement DeviceID = driver.findElement(By.id("device_name"));
		String ID = DeviceID.getText();
		System.out.println("Your device ID is " + ID);

		driver.quit();

	}

}