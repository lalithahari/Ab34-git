package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timeout 
{ChromeDriver driver;
	@Test(timeOut=2000)
	public void testcase1()
		{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);
		}

}
