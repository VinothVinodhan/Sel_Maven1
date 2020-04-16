package feature;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class WebMobnew {
	static WebDriver driver;
	static WebElement PINValue;
	static String pinnumber;

	static By IMEI = By.id("txtadddevice");
	static By Search = By.xpath(".//*[@id='btnAddDevice']");
	static By DeviceID = By.xpath(".//*[@id='searchPhoneNumber']");
	static By Searchbutton = By.xpath(".//*[@id='btnSearch']");
	static By ModelName = By.xpath(".//*[@id='Search_71db449c-5e61-4fa7-8a98-7252ac8c7ee9']/div/div[1]/label[3]");
	static By LastSync = By.xpath(".//*[@id='Search_71db449c-5e61-4fa7-8a98-7252ac8c7ee9']/div/div[3]/label");
	static By Connect = By.xpath(".//*[@id='btnConnect']");

	// RC steps
	static By SessionStep1 = By.xpath(".//*[@id='step1_id_desc']");
	static By SessionStep2 = By.xpath(".//*[@id='step2_id_desc']");
	static By SessionStep3 = By.xpath(".//*[@id='step3_id_desc']");

	// PIN Screen
	// By PINMessage = By.xpath(".//*[@id='txtInstructionalMessage']");
	static By PINMessage = By.id("txtInstructionalMessage");

	// Landing page
	static By DeviceName = By.xpath(".//*[@id='spansummarytooltip']");
	static By DeviceSummary = By.xpath(".//*[@id='Device_Summary_SideBar']/div[2]/h4");
	static By AndroidVersion = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[1]/div[2]");
	static By Model = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[2]/div[2]");
	static By AVersion = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[1]/div[2]");
	static By FM = By.xpath(".//*[@id='liFileManager']/a");
	static By FMSession = By.xpath(".//*[@id='FM_step3_id_desc']");
	static By FMWaitResponse = By.xpath(".//*[@id='FMPin_container']/div/div/p[1]");
	static By FMLanding = By.xpath(".//*[@id='divExpandFMDeviceDetail']/div[1]/div/h3[2]");

	public static WebDriver searchConnect(String URL) throws MalformedURLException, InterruptedException {

		// Mobile
		DesiredCapabilities capabilities = DesiredCapabilities.android();
		capabilities.setCapability("deviceName", "LGH931391140be");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("version", "8.0.0");
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("fullReset", false);
		capabilities.setCapability("appPackage", "com.aetherpal.enterprise");
		// capabilities.setCapability("app",
		// "C:\\Users\\manju\\Desktop\\apk\\AP_MS_142_3550.apk");
		// capabilities.setCapability("appWaitActivity","com.aetherpal.android.tools.remotecontrol.dialogs.Authentication");
		capabilities.setCapability("appWaitActivity", "com.aetherpal.smartcare.ValetScueActivity");
		capabilities.setCapability("appActivity", "com.aetherpal.smartcare.ValetScueActivity");
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

		// selecting MSM app
		driver1.findElement(By
				.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout"))
				.click();
		driver1.findElement(By.id("com.android.settings:id/switch_widget")).click();
		driver1.findElement(By.id("android:id/button1")).click();

		// Clicking back
		((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver1).pressKeyCode(AndroidKeyCode.BACK);

		// 
		System.out.println(driver1.findElement(By.id("android:id/alertTitle")).getText());
		driver1.findElement(By.id("android:id/button1")).click();

		driver1.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Remote Control button clicked");
		Thread.sleep(2000);

		String DeviceID = driver1.findElement(By.id("device_name")).getText();
		System.out.println(DeviceID);
		Thread.sleep(1000);
		String DeviceIDValue = DeviceID.substring(11);
		System.out.println("Device ID value: " + DeviceIDValue);

		driver1.findElement(By.id("breadcrumbanchor")).click();
		System.out.println("Menu button clicked");
		Thread.sleep(1000);

		driver1.findElement(By.id("about")).click();
		System.out.println("About clicked");
		Thread.sleep(2000);

		String Version = driver1
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[1]"))
				.getText();
		System.out.println(Version);

		String BundleID = driver1
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[2]"))
				.getText();
		System.out.println(BundleID);

		String Tenant = driver1
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[3]"))
				.getText();
		System.out.println(Tenant);

		String DeviceID1 = driver1
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[4]"))
				.getText();
		System.out.println(DeviceID1);

		//Clicking check update 
/*		
		WebElement Update = driver1.findElement(By.id("btnCheckUpdate"));
		String UpdateButton = Update.getText();
		System.out.println(UpdateButton);
		Update.click();
		Thread.sleep(2000);
*/
/*		String text = driver1
				.findElement(By
						.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View"))
				.getText();
		System.out.println(text);
*/
		driver1.findElement(By.id("breadcrumbanchor")).click();

		// Chrome
		// initializing Chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//Selenium//Selenium//Software//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Below code is to search by device id and get PIN number in chrome
		driver.get(URL);
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("aetherpal@1");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("searchPhoneNumber")).sendKeys(DeviceIDValue);
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);

		// below code is to get Model name from search block
		System.out.println("Search completed and land on Search box");
		String Model = driver.findElement(ModelName).getText();
		System.out.println("Your Device Model is " + Model);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		// Click connect button
		driver.findElement(Connect).click();
		System.out.println("Wait to get connected");
		Thread.sleep(5000);

		WebElement Step1 = driver.findElement(SessionStep1);
		wait.until(ExpectedConditions.visibilityOf(Step1));
		String Message1 = Step1.getText();
		System.out.println(Message1);

		WebElement Step2 = driver.findElement(SessionStep2);
		wait.until(ExpectedConditions.visibilityOf(Step2));
		String Message2 = Step2.getText();
		System.out.println(Message2);

		WebElement Step3 = driver.findElement(SessionStep3);
		wait.until(ExpectedConditions.visibilityOf(Step3));
		String Message3 = Step3.getText();
		System.out.println(Message3);

		WebElement PINInstruction = driver.findElement(PINMessage);
		wait.until(ExpectedConditions.visibilityOf(PINInstruction));
		String PINInst = PINInstruction.getText();
		System.out.println("PIN Instruction is " + PINInst);

		System.out.println("Waiting to get pin number");
		PINValue = driver.findElement(By.id("pinvalue"));
		pinnumber = PINValue.getText();
		System.out.println(pinnumber);

		// initiating RC
		// driver.findElement(By.xpath(".//*[@id='btnConnect']")).click();

		// Below code is to Enter PIN value in mobile
		driver1.findElement(By.id("com.aetherpal.enterprise:id/editPin")).sendKeys(pinnumber);

		driver1.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println("Waited for 5 seconds");
		driver1.findElement(By.id("com.aetherpal.enterprise:id/buttonAccept")).click();

		// below steps are to initiate FM
		Thread.sleep(2000);

		driver.findElement(FM).click();
		WebElement FMStep = driver.findElement(FMSession);
		wait.until(ExpectedConditions.visibilityOf(FMStep));
		String FMStep1 = driver.findElement(FMSession).getText();
		System.out.println("FileManager session initiated");
		System.out.println(FMStep1);

		WebElement Respose = driver.findElement(FMWaitResponse);
		wait.until(ExpectedConditions.visibilityOf(Respose));
		String Userresp = driver.findElement(FMWaitResponse).getText();
		System.out.println(Userresp);

		// below code is to give permission for FM in mob
		driver1.findElement(By.id("com.aetherpal.enterprise:id/buttonYes")).click();

		// chrome landing page
		WebElement FMLandingpage = driver.findElement(FMLanding);
		wait.until(ExpectedConditions.visibilityOf(FMLandingpage));
		String FMmodel = driver.findElement(FMLanding).getText();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("FileManager is been initiated " + FMmodel);

		return driver;

	}

}
