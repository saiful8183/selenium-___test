package parallalTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftandHardAssertTest {


	
	@Test
	public void testLoginButton() {
		
	System.out.println("Login button is displayed");
	
	SoftAssert softAssert=new SoftAssert(); //soft assert .in this case Assert has 
	//to be change to softAssert
	
	
	
	String actualText="google";//If I change G small letter then line 22 
	//not print and 2 got failed
	String expectedText="Google";
	
	
	
	softAssert.assertEquals(actualText, expectedText);                                        //Assert is a class name
	System.out.println("Test passed");
	 softAssert.assertAll();//only for softAssert
	
		}
	
	@Test
	public void testLoginButtonEnabled() {
		
		System.out.println("Login button is enaabled");	
			Assert.fail();
			System.out.println("login succesfull");//it will not print because of hard assertion
			
			
			}
	
	@Test
	public void testLoginButtonClickable() {
		
		System.out.println("Login button is clikable");	
			
	}
}
	
	
	
	
	
	
	
	
	
	
	

