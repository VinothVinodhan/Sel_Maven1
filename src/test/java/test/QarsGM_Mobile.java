package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class QarsGM_Mobile {
	
	@Test
	public void mobileSide() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "CB5A20X5AA");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "6.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("app", "C:/Users/manju/Desktop/apk/AP_MS_142_3550.apk");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.remotecontrol.dialogs.Authentication");
		capabilities.setCapability("appActivity", "com.aetherpal.remotecontrol.dialogs.Authentication");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		MobileDriver driver = new AndroidDriver(url, capabilities);
		System.out.println("Hello the app started.");
		Thread.sleep(10000);

		
		
		// entering pin
		driver.findElement(By.id("com.aetherpal.enterprise:id/editPin")).sendKeys("2111");
		driver.findElement(By.id("com.aetherpal.enterprise:id/buttonAccept")).click();
		// giving allow in device
		driver.findElement(By.id("android:id/button1")).click();
	}


}
