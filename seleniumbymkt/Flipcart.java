package seleniumbymkt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		// LAunch flipcart in guestmode and enter mobile number clicl request otp and close login popup 
		//using relative xpath

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("8142430280");
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Set<String> parentandchild=driver.getWindowHandles();
		Iterator <String> d1 = parentandchild.iterator();
		String p1=d1.next();
		String c1=d1.next();
		driver.switchTo().window(c1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[.='Enter Email/Mobile number']")).sendKeys("8142430280");*/
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
	
	
}

}
