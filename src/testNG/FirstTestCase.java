



package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestCase {

	@BeforeClass
	
	void beforeClass(){
		System.out.println("Before Class");
	}

	@AfterClass
	
	void afterClass(){
		System.out.println("After Class");
	}
	
	
	
	@BeforeMethod
	
	void beforeMethod(){
		System.out.println("Before Method");
	}
	
	
	
	@AfterMethod
	
	void afterMethod(){
		System.out.println("After method");
	}
	
	@Test(priority=1)
	void setup() {
		
		System.out.println("This is set up test");
	}
	
	@Test(priority=2,enabled=false)
	void login() {
		
		
		
		System.out.println("This is login test");
		
	}
	
	@Test(priority=3)
	void tearDown() {
		System.out.println("closing browser");
	}
	
	
	@BeforeTest
	void beforeTest() {
		System.out.println("Before the test");
	}
	
	
	
	@AfterTest
	void afterTest() {
		System.out.println("After the test");
	}
	
	
	
}
