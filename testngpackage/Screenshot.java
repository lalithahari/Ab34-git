package testngpackage;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	


@Test
public void testcase1() throws IOException
	{
// driver.findelemnt() not getting beacuse ChromeDriver class is local not global.
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("india");
	search.sendKeys(Keys.ENTER);
	//step1
		TakesScreenshot ts=      driver;
		//step2
		File source=ts.getScreenshotAs(OutputType.FILE);
	
	//step3
		File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\screenshot\\hari.png");
		//step4
		FileUtils.copyFile(source,destination);
	driver.quit();
	}
	
}




