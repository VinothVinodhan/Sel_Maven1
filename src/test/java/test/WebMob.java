package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class WebMob {
	static WebDriver driver1;
	WebElement PINValue;
	String pinnumber;

	@Test
	public void searchConnect() throws MalformedURLException, InterruptedException {

		// Mobile
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "LGH931391140be");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "8.0.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		capabilities.setCapability("app", "C:/Users/manju/Desktop/apk/AP_MS_142_3550.apk");
		// capabilities.setCapability("appWaitActivity","com.aetherpal.android.tools.remotecontrol.dialogs.Authentication");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("newCommandTimeout", 100);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		MobileDriver driver = new AndroidDriver(url, capabilities);

		// below code is to turn on Accessibility
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.TextView[1]"))
				.click();
		driver.findElement(By.id("com.android.settings:id/switch_widget")).click();
		driver.findElement(By.id("android:id/button1")).click();
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		driver.findElement(By.id("android:id/button1")).click();

		//("automationname" "uiautomator2")
		
		
		
		// below code is to get Device ID from Mobile
		System.out.println("Hello the app started.");
		System.out.println("Please cancel the accesibility and wait for 20 seconds");
		Thread.sleep(2000);
		System.out.println("Looks your waiting time over");

		driver.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Remote Control button clicked");
		Thread.sleep(2000);

		String DeviceID = driver.findElement(By.id("device_name")).getText();
		System.out.println(DeviceID);
		Thread.sleep(1000);
		String DeviceIDValue = DeviceID.substring(11);
		System.out.println("Device ID value: " + DeviceIDValue);

		driver.findElement(By.id("breadcrumbanchor")).click();
		System.out.println("Menu button clicked");
		Thread.sleep(1000);

		driver.findElement(By.id("about")).click();
		System.out.println("About clicked");
		Thread.sleep(2000);

		String Version = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[1]"))
				.getText();
		System.out.println(Version);

		String BundleID = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[2]"))
				.getText();
		System.out.println(BundleID);

		String Tenant = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[3]"))
				.getText();
		System.out.println(Tenant);

		String DeviceID1 = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[4]"))
				.getText();
		System.out.println(DeviceID1);

		WebElement Update = driver.findElement(By.id("btnCheckUpdate"));
		String UpdateButton = Update.getText();
		System.out.println(UpdateButton);
		Update.click();
		Thread.sleep(2000);

		String text = driver
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View"))
				.getText();
		System.out.println(text);

		driver.findElement(By.id("breadcrumbanchor")).click();

		// Chrome
		// initializing Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C://Users//VinothKumar//Desktop//Vinoth//Selenium//Driver//chromedriver.exe");
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();

		// Below code is to search by device id and get PIN number in chrome
		driver1.get("https://qars-gm.ent.aetherpal.com/wbc");
		driver1.findElement(By.id("txtUserName")).sendKeys("admin");
		driver1.findElement(By.id("txtPassword")).sendKeys("aetherpal@1");
		driver1.findElement(By.id("btnLogin")).click();
		driver1.findElement(By.id("searchPhoneNumber")).sendKeys(DeviceIDValue);
		driver1.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(".//*[@id='btnConnect']")).click();
		System.out.println("Waiting to get pin number");
		Thread.sleep(20000);
		PINValue = driver1.findElement(By.id("pinvalue"));
		pinnumber = PINValue.getText();
		System.out.println(pinnumber);

		// Below code is to Enter PIN value in mobile
		driver.findElement(By.id("com.aetherpal.enterprise:id/editPin")).sendKeys(pinnumber);

		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println("Waited for 5 seconds");
		driver.findElement(By.id("com.aetherpal.enterprise:id/buttonAccept")).click();

	}

}