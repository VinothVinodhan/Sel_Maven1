package feature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommandLineSession {
	WebDriver driver;

	// Command Line
	By CommandLine = By.xpath(".//*[@id='liCommandLine']/a");
	By CLStep1 = By.xpath(".//*[@id='CL_step3_id_desc']");
	By CLStep2 = By.xpath(".//*[@id='CL_step4_id_desc']");
	By CLWaitResponse = By.xpath(".//*[@id='CLPin_container']/div/div/p[1]");
	By cmddisplay = By.xpath(".//*[@id='CL_Cmd_display']/section[2]/span");
	By cmdfield = By.xpath(".//*[@id='CL_Cmd_display']");
	By CLdisconnect = By.xpath(".//*[@id='cl_footer_disconect']");

	public void CLIntial() {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		driver.findElement(CommandLine).click();
		System.out.println("FileManager session initiated");

		// Step1
		WebElement CLFirststep = driver.findElement(CLStep1);
		wait.until(ExpectedConditions.visibilityOf(CLFirststep));
		String Step1 = driver.findElement(CLStep1).getText();
		System.out.println("First Step: " + Step1);

		// Step2
		WebElement CLSecondstep = driver.findElement(CLStep2);
		wait.until(ExpectedConditions.visibilityOf(CLSecondstep));
		String Step2 = driver.findElement(CLStep2).getText();
		System.out.println("Second Step: " + Step2);

		// User response time
		WebElement Respose = driver.findElement(CLWaitResponse);
		wait.until(ExpectedConditions.visibilityOf(Respose));
		String UserResp = driver.findElement(CLWaitResponse).getText();
		System.out.println(UserResp);

		// CL landing page
		WebElement LandingPage = driver.findElement(cmddisplay);
		wait.until(ExpectedConditions.visibilityOf(LandingPage));
		String cmd = driver.findElement(cmddisplay).getText();
		System.out.println(cmd);

	}

	public void cmd() {
		WebElement LandingPage = driver.findElement(cmdfield);
		LandingPage.sendKeys("adb shell");

	}

	public void CL_disconnect() {
		WebElement Disconnect = driver.findElement(CLdisconnect);
		Disconnect.click();
		System.out.println("Your CL Session is been disconnected");
	}

	// creating constructor
	public CommandLineSession(WebDriver D) {
			this.driver = D;
		}
}
