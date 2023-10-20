package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google_Launch 
{ ChromeDriver driver;
private Object keys;
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testcase1()
		{
	// driver.findelemnt() not getting beacuse ChromeDriver class is local not global.
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);
		}
	@AfterMethod
	public void quit() throws InterruptedException 
	{
	Thread.sleep(3000);
		driver.close();	
	}

}

