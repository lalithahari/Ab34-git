package Datasheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Project_data {
	@Test
	public static void data() throws EncryptedDocumentException, IOException
	{
	FileInputStream fs=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\Excel Sheet\\Lallihari.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	Sheet s= wb.getSheet("Login");
	/*Row r=s.getRow(1);
	Cell c=r.getCell(0);
	String username=c.getStringCellValue();
	System.out.println(username);
	Row r1=s.getRow(1);
	Cell c1=r1.getCell(1);
	String password=c1.getStringCellValue();
	System.out.println(password);*/
	String username=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	System.out.println(username);
	String password=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	System.out.println(password);


	}
}
	


	


