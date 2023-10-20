package testngpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)
public class ScreenshotFail 
{
@Test
public void screenshot1() throws InterruptedException, IOException 
	{
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("india");
	search.sendKeys(Keys.ENTER);
		TakesScreenshot ts=      driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\Screenshot3\\aadhya"+Math.random()+".png");
		FileUtils.copyFile(source,destination);
		
	     
	       
	}
@Test(timeOut=1000)
	public void screenshot2() throws InterruptedException, IOException 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("France");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot ts=      driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\Failedscreenshot\\aadhya1"+Math.random()+".png");
		FileUtils.copyFile(source,destination);
		
	     
	       
	}
	
}

