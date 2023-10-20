package testngpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Class_DataDrivenTesting
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream fs=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\Excel Sheet\\Lalithaexcel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	Sheet s= wb.getSheet("Login");
	Row r=s.getRow(1);
	Cell c=r.getCell(1);
	String username=c.getStringCellValue();
	System.out.println(username);
	Row r1=s.getRow(1);
	Cell c1=r1.getCell(1);

	}
	


	

}
