package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Learnbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("india");
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	
	}
}


