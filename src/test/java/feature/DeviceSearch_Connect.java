package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeviceSearch_Connect {
	WebDriver driver;
	String PINVal;

	By IMEI = By.id("txtadddevice");
	By Search = By.xpath(".//*[@id='btnAddDevice']");
	By DeviceID = By.xpath(".//*[@id='searchPhoneNumber']");
	By Searchbutton = By.xpath(".//*[@id='btnSearch']");
	By ModelName = By.xpath(".//*[@id='Search_71db449c-5e61-4fa7-8a98-7252ac8c7ee9']/div/div[1]/label[3]");
	By LastSync = By.xpath(".//*[@id='Search_71db449c-5e61-4fa7-8a98-7252ac8c7ee9']/div/div[3]/label");
	By Connect = By.xpath(".//*[@id='btnConnect']");

	// RC steps
	By SessionStep1 = By.xpath(".//*[@id='step1_id_desc']");
	By SessionStep2 = By.xpath(".//*[@id='step2_id_desc']");
	By SessionStep3 = By.xpath(".//*[@id='step3_id_desc']");

	// PIN Screen
	// By PINMessage = By.xpath(".//*[@id='txtInstructionalMessage']");
	By PINMessage = By.id("txtInstructionalMessage");
	By PINValue = By.xpath(".//*[@id='pinvalue']");
	// Landing page
	By DeviceName = By.xpath(".//*[@id='spansummarytooltip']");
	By DeviceSummary = By.xpath(".//*[@id='Device_Summary_SideBar']/div[2]/h4");
	By AndroidVersion = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[1]/div[2]");
	By Model = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[2]/div[2]");
	By AVersion = By.xpath(".//*[@id='divsoftwareinfo']/ul/li[1]/div[2]");

	// Disconnect
	By Disconnect = By.xpath(".//*[@id='footer_toolbar']/ul/li[13]");

	// File Manager
	By FM = By.xpath(".//*[@id='liFileManager']/a");
	By FMSession = By.xpath(".//*[@id='FM_step3_id_desc']");
	By FMWaitResponse = By.xpath(".//*[@id='FMPin_container']/div/div/p[1]");
	By FMLanding = By.xpath(".//*[@id='divExpandFMDeviceDetail']/div[1]/div/h3[2]");
	By UploadButton = By.xpath(".//*[@id='btnFileUpload_new']");
	By BrowseButton = By.xpath(".//*[@id='lblBrowse']");
	By CancelUpload = By.xpath(".//*[@id='divUpload_BrowseBtn']/div[3]/i");

	// Uploading file
	By FMWindow = By.xpath(".//*[@id='headerUpload_new']");
	// By YetToStart =
	// By.xpath(".//*[@id='divProgressStatus_45a31e7c-3f65-c4cb-8f55-57bb53e80991']");
	By uploadingpercentage = By.xpath(".//*[@id='divProgressStatus_1e09f0d8-372a-1aa9-af7e-40dec31a46aa']");
	By Inprogress = By.xpath(".//*[@id='divUpload_new']/article/div/ul/li[1]/a/span[2]");
	By Completed = By.xpath(".//*[@id='divUpload_new']/article/div/ul/li[2]/a/span[2]");
	By Filename = By.xpath(".//*[@id='divFileName_45a31e7c-3f65-c4cb-8f55-57bb53e80991']");

	// Replace
	By Replace = By.xpath(".//*[@id='divReplacefooter']/ul/li[1]/input");

	
	public void Search() throws InterruptedException {

		driver.findElement(DeviceID).sendKeys("");
		// driver.findElement(Search).click();
		driver.findElement(Searchbutton).click();
		Thread.sleep(3000);
		System.out.println("Device has been searched");

	}

	public void searchblock() {

		System.out.println("Search completed and land on Search box");

		String Model = driver.findElement(ModelName).getText();
		System.out.println("Your Device Model is " + Model);
		// String LastSyncTime = driver.findElement(LastSync).getText();
		// System.out.println(LastSyncTime);

	}

	public void InitiateRC() throws InterruptedException {
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

		WebElement PIN = driver.findElement(PINValue);
		wait.until(ExpectedConditions.visibilityOf(PIN));
		PINVal = PIN.getText();
		System.out.println("PIN Instruction is " + PINVal);

		/*
		 * WebElement LandingPage = driver.findElement(DeviceName);
		 * wait.until(ExpectedConditions.visibilityOf(LandingPage)); String
		 * Devicemodel = driver.findElement(DeviceName).getText();
		 * System.out.println("Landing Page: Connected device is " +
		 * Devicemodel);
		 * 
		 * WebElement Version = driver.findElement(AndroidVersion);
		 * wait.until(ExpectedConditions.visibilityOf(Version)); String
		 * OSVersion = driver.findElement(AndroidVersion).getText();
		 * System.out.println("Landing Page: Connected device is " + OSVersion);
		 * 
		 * WebElement Landingpage1 = driver.findElement(Model);
		 * wait.until(ExpectedConditions.visibilityOf(Landingpage1)); String
		 * ModelName = driver.findElement(Model).getText();
		 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		 * System.out.println("Device Summary: Connected device Model is " +
		 * ModelName);
		 * 
		 * WebElement Landingpage2 = driver.findElement(AVersion);
		 * wait.until(ExpectedConditions.visibilityOf(Landingpage2)); String
		 * AndVersion = driver.findElement(AVersion).getText();
		 * driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		 * System.out.println("Device Summary: Connected device OS Version is "
		 * + AndVersion);
		 */
	}

	public void DeviceSummary() {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		// Device Model
		WebElement LandingPage = driver.findElement(DeviceName);
		wait.until(ExpectedConditions.visibilityOf(LandingPage));
		String Devicemodel = driver.findElement(DeviceName).getText();
		System.out.println("Connected device is " + Devicemodel);

		// OS Version
		WebElement Version = driver.findElement(AndroidVersion);
		wait.until(ExpectedConditions.visibilityOf(Version));
		String OSVersion = driver.findElement(AndroidVersion).getText();
		System.out.println("Connected device is " + OSVersion);
	}

	public void Disconnect() {
		driver.findElement(Disconnect).click();
		System.out.println("Session disconnected");
	}

	// creating constructor
	public DeviceSearch_Connect(WebDriver D) {
		this.driver = D;
	}

}
