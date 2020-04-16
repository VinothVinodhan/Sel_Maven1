package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class MsmAccessibility {

	@Test
	public void accessibilityExample() throws MalformedURLException, InterruptedException {
		// Mobile
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "LGH931391140be");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "8.0.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("dontStopAppOnReset", false);
		capabilities.setCapability("newCommandTimeout", 0);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		MobileDriver driver1 = new AndroidDriver(url, capabilities);

		// below code is to get Device ID from Mobile
		System.out.println("Hello the app started.");
		System.out.println("Please cancel the accesibility and wait for 20 seconds");
		Thread.sleep(20000);
		System.out.println("Looks your waiting time over");

		driver1.findElement(By.id("android:id/button1")).click();

		// swipe till down
		int durationMS = 4000;
		Dimension size = driver1.manage().window().getSize();
		for (int i = 0; i <= 3; i++) {
			int startx = size.width / 2;
			System.out.println(size);
			int starty = (int) (size.height * 0.60);
			int endy = (int) (size.height * 0.10);
			driver1.swipe(startx, starty, startx, endy, durationMS);
			System.out.println(i);
		}

		driver1.findElement(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout"))
				.click();
		driver1.findElement(By.id("com.android.settings:id/switch_widget")).click();
		driver1.findElement(By.id("android:id/button1")).click();

		//((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);
		
		System.out.println(driver1.findElement(By.id("android:id/alertTitle")).getText());
		driver1.findElement(By.id("android:id/button1")).click();
		
		driver1.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Remote Control button clicked");
		Thread.sleep(2000);

		//driver1.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();
		//driver1.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']")).click();

	}
}