package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick 
{
@Test
public void doubleclick()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement mob=driver.findElement(By.linkText("Mobiles"));
	Actions a1=new Actions(driver);
	a1.doubleClick(mob).perform();
	
}
}
