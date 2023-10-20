package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Actions a1=new Actions(driver);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	WebElement search=driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
	Actions a2=new Actions(driver);
	a1.moveToElement(search).perform();
	driver.findElement(By.linkText("Men's Casual Shirts")).sendKeys(Keys.ENTER);
	
	}

}
