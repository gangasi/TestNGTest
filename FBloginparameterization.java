package parameterization;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBloginparameterization{
	
	@Test
	public void fbLoginLogout() throws IOException{

		// Load the file.
		File ExcelFile =new File("C://Selenium//Testdata//Testingdata.xlsx");
		FileInputStream input=new FileInputStream(ExcelFile);
		XSSFWorkbook wb=new XSSFWorkbook(input);
		XSSFSheet Sheet= wb.getSheetAt(0);
		Iterator<Row>rowIt=Sheet.iterator();
		int rowCount = Sheet.getLastRowNum()-Sheet.getFirstRowNum();
			
		Object array[][]=new Object[2][2];
		for(int i=0;i<rowCount;i++)
		{

			for( int j=0;j<2;j++)
			{

				array[i][j]=Sheet.getRow(i+1).getCell(j).toString();
				System.out.println(array[i][j]);
			}
		}
		

	}
}

