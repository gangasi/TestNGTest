package parameterization;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Reading data from excel and logging into website and logout
public class ExcelUtils {

	WebDriver driver;
	@DataProvider(name="Excelsheet")
	public Object[][] readData() throws Exception
	{
		File f = new File("C://Selenium//Testdata//Testingdata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workBook = (XSSFWorkbook) WorkbookFactory.create(fis);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		Object array[][]=new Object[2][2];
		for(int i=0;i<2;i++)
		{

			for( int j=0;j<2;j++)
			{

				array[i][j]=sheet.getRow(i+1).getCell(j).toString();

			}
		}
		return array;

}
	@Test(dataProvider="Excelsheet")
	public void testData(String Username , String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.qaclickacademy.com");
		driver.manage().window().maximize();
		driver.navigate().refresh(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Argument passed will be used here as String Variable
		System.out.println(Username);
		driver.findElement(By.id("user_email")).sendKeys(Username);
		System.out.println("Username tested successfully");
		System.out.println(password);
		driver.findElement(By.id("user_password")).sendKeys(password);
		System.out.println("password tested successfully");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.className("gravatar")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		driver.quit();
		
	}

}