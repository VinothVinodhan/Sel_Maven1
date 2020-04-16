package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manju//Desktop//besant//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test

	public void Reg() {
		driver.get("http://demoqa.com/");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		driver.findElement(By.name("first_name")).sendKeys("Name");
		driver.findElement(By.name("last_name")).sendKeys("Name1");

	}

	@AfterTest
	public void logout() {
		driver.close();

	}

}