


package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTestCases {

	
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
	
	
	
	
	
	
	@Test(priority=1,groups= {"sanity"})
	void setup() {
		
		System.out.println("This is set up test");
		
		
		Assert.fail();
	}
	

	
	
	
	
	@Test(priority=3,dependsOnMethods= {"setup"},groups= {"sanity"})
	void searchcustomer() {
		System.out.println("This is searchcustomer test");
		
	}
	
	
	
	
	@Test(priority=2,dependsOnMethods= {"searchcustomer"},groups= {"smoke"})
	void addcustomer() {
		System.out.println("This is addcustomer test");
	
	
	
	}
	
	
	
	
	
	@Test(priority=4,dependsOnMethods= {"addcustomer","searchcustomer"},alwaysRun=true,groups= {"smoke"})
	void tearDown() {
		System.out.println("closing browser");
	}
	
	
	
	
	
	
	
	@BeforeSuite
	void beforesuite() {
		System.out.println("Before suite");
	}
	
	
	
	
	
	@AfterSuite
	void aftersuite() {
		System.out.println("after suite");
	}
	
	
	}
