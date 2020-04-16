package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass1 {

	// import only testng
	@Test(priority = 2)
	public void m1() {
		System.out.println("This is first test method");

	}

	@BeforeTest
	public void m2() {
		System.out.println("This is before test method");

	}

	@AfterTest
	public void m3() {
		System.out.println("After test method");

	}

	@BeforeClass
	public void m4() {
		System.out.println("this is before class");

	}

	@AfterClass
	public void m5() {
		System.out.println("this is after class");

	}

	@Test(priority = 1)
	public void m() {
		System.out.println("This is second test method");

	}

	@BeforeMethod
	public void m7() {
		System.out.println("This is second before method");

	}

	@AfterMethod
	public void m8() {
		System.out.println("This second is after method");

	}

	@BeforeSuite
	public void m9() {
		System.out.println("This second is before suite");

	}

	@AfterSuite
	public void m10() {
		System.out.println("This second is after suite");

	}

}
