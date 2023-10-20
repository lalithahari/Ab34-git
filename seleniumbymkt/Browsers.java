package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browsers{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		 driver =new  EdgeDriver();
		 driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("india");
				wb.click();
	}
		// TODO Auto-generated method stub
public void launch1()
{
	 driver =new  EdgeDriver();
	 driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	WebElement wb=driver.findElement(By.name("q"));
	wb.sendKeys("france");
			wb.click();
	
}
	}


