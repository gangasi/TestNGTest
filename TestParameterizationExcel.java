package parameterization;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class TestParameterizationExcel  {

	public static void Exceldemo() throws Exception {
	
	File ExcelFile =new File("C:\\Users\\samarth\\Desktop\\Testdata1.xlsx");
	FileInputStream input=new FileInputStream(ExcelFile);
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet Sheet= wb.getSheetAt(0);
	int totalrow=Sheet.getLastRowNum();
	//System.out.println(totalrow);

	for(int i=0;i<=totalrow;i++) {
		for(int j=0;j<2;j++) {
		XSSFCell result=Sheet.getRow(i).getCell(j);
	  		System.out.println(result);
	  		
		}
		System.out.println(   );
	}
}
}
	
	
	


