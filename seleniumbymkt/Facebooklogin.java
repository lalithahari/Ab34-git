package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin 
{
			public static void main(String[] args)
			{
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.id("email")).sendKeys("8142430280");
				driver.findElement(By.id("pass")).sendKeys("aadhya123");
				driver.findElement(By.name("login")).click();
				
			}

	
}


