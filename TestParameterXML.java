package parameterization;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
//@Parameters({"browser"})
@Test
public class TestParameterXML {
	
	
	public void getBrowser(String browser) {
		
		System.out.println(browser);
	}
	

}
