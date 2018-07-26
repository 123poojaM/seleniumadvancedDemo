package Utilitypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import FrameworkPages.Register;

public class ExcelUtility {
	
public void TestExcel() throws IOException {
	
	FileInputStream fin=new FileInputStream("C:\\Users\\pdc4-training.pdc4\\Desktop\\TestingUtility.xls");
	HSSFWorkbook x=new HSSFWorkbook(fin);
	HSSFSheet s=x.getSheet("Sheet1");
	int rowcount =s.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		String FirstName=s.getRow(i).getCell(0).getStringCellValue();
		String LastName=s.getRow(i).getCell(1).getStringCellValue();
		String Email=s.getRow(i).getCell(2).getStringCellValue();
		String Password=s.getRow(i).getCell(3).getStringCellValue();
		String confirmpassword=s.getRow(i).getCell(4).getStringCellValue();
		System.out.println(FirstName+" "+LastName+" "+Email+" "+Password+" "+confirmpassword+" ");
		Register.enterReg(FirstName,LastName, Email, Password, confirmpassword);
		
	}
	System.out.println(rowcount);
	//String data=s.getRow(1).getCell(0).getStringCellValue();
}

public static void main(String args[]) throws IOException
		{
	
	ExcelUtility e=new ExcelUtility();
	e.TestExcel();
	
	
}

}
