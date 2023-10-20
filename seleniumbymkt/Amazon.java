package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).sendKeys("watches");
        driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")).submit();
    	
	
	}

}