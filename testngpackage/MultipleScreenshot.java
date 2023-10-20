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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class MultipleScreenshot 
{
ChromeDriver driver;
@BeforeMethod
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}
@Test
public void test1()
{
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("india");
	search.sendKeys(Keys.ENTER);
}
@Test
public void test2()
	{
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("France");
	search.sendKeys(Keys.ENTER);
	}
@AfterMethod
public void quit() throws InterruptedException, IOException 
{
	TakesScreenshot ts=      driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\dell\\eclipse-workspace\\Grotechminds\\screenshot\\aadhya"+Math.random()+".png");
	FileUtils.copyFile(source,destination);
	Thread.sleep(3000);
       driver.quit();
       
}
}
	

