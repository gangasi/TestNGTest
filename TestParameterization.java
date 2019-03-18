package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	@Test(dataProvider="getdata")
	public void doLogin(String Username,String Password)
	{
		System.out.println(Username+"  "+Password);
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="trainer1@gmail.com";
		data[0][1]="abcdef";
		
		data[1][0]="trainer2@gmail.com";
		data[1][1]="abcdefg";
		
		data[2][0]="trainer1@gmail.com";
		data[2][1]="abcdefgh";
		return data;
	}

}
