package seleniumbymkt;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelFetch {
	@Test
	public void add(String args[]) throws EncryptedDocumentException, IOException
	{
FileInputStream fs=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\Excel Sheet\\Lallihari.xlsx");
Workbook wb=WorkbookFactory.create(fs);
Sheet s= wb.getSheet("Login");
Row r=s.getRow(1);
Cell c=r.getCell(1);
String username=getStringCellvalue();
System.out.println(username);
}

	private String getStringCellvalue() {
		// TODO Auto-generated method stub
		return null;
	}
}
