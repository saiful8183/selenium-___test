package parallalTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FieldValidationTest {

	

	@Test
	public void testLoginButton() {
		
	System.out.println("Login button is displayed");	
		
		}
	
	@Test
	public void testLoginButtonEnabled() {
		
		System.out.println("Login button is enaabled");	
			//Assert.fail();
			System.out.println("login succesfull");//it will not print because of hard assertion
			
			
			}
	
	@Test
	public void testLoginButtonClickable() {
		
		System.out.println("Login button is clikable");	
			
	}
	
	
	
	
	
	
	
	
	
}
