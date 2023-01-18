package parallalTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	
	@Test(dataProvider="getData")
	public void doLogin(String userName,String passWord) {
	
	System.out.println("Doing login testing");
	System.out.println(userName +"========="+passWord);
	
	}
	@DataProvider
	
	public Object[][]getData() {
		Object[][]data=new Object[3][2];
		
		data[0][0]="First username";
		data[0][1]="First password";
		
		
		data[1][0]="Second username";
		data[1][1]="Second password";
		
		
		data[2][0]="Third username";
		data[2][1]="Third password";
		
		return data;
	}	
		
		
		}
