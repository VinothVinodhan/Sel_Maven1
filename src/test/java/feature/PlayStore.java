package feature;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class PlayStore {

	@Test
	public void SearchGame() throws MalformedURLException, InterruptedException {
		// Creating object for DesiredCapabilities
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "03157df3836e0e1b");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "8.0.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.android.vending");
		capabilities.setCapability("appWaitActivity", ".AssetBrowserActivity");
		capabilities.setCapability("appActivity", ".AssetBrowserActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		MobileDriver driver1 = new AndroidDriver(url, capabilities);

	}
}