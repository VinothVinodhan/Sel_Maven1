package test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class QarsGM {
	static WebDriver driver;
	WebElement PIN; 
	String pinValue;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void login() {
		driver.get("https://qars-gm.ent.aetherpal.com/wbc");
		driver.findElement(By.id("txtUserName")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("aetherpal@1");
		driver.findElement(By.id("btnLogin")).click();
	}

	@Test(priority = 3)
	public void searchConnect() throws InterruptedException {
		driver.findElement(By.id("searchPhoneNumber")).sendKeys("0151fb41a8");
		driver.findElement(By.id("btnSearch")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnConnect']")).click();
		System.out.println("Waiting to get pin number");
		Thread.sleep(20000);
		PIN = driver.findElement(By.id("pinvalue"));
		pinValue = PIN.getText();
		
		System.out.println(pinValue);
		Thread.sleep(20000);
	}

	@Test(priority = 2)
	public void mobileSide() throws MalformedURLException, InterruptedException {
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

		// com.aetherpal.remotecontrol.dialogs.Authentication
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		MobileDriver driver = new AndroidDriver(url, capabilities);
		System.out.println("Hello the app started.");
		Thread.sleep(50000);
		System.out.println("pin to enter");

/*		driver.findElement(By.id("footer_devicehealth")).click();
		System.out.println("Clicked on.");
		Thread.sleep(10000);
*/

	}
	@Test(priority=4)
	public void enterPIN() throws InterruptedException{
		
		// entering pin
		WebElement TextBox = driver.findElement(By.id("com.aetherpal.enterprise:id/editPin"));
		TextBox.sendKeys(pinValue);
		System.out.println("PIN Entered");
		Thread.sleep(15000);
		System.out.println("Waited for 5 seconds");
		//driver.findElement(By.id("com.aetherpal.enterprise:id/buttonAccept")).click();
		// giving allow in device
		driver.findElement(By.id("com.aetherpal.enterprise:id/buttonAccept")).click();
		
	}

}
