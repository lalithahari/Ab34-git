package seleniumbymkt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Naukri_GetWindowHandles 
{

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.naukri.com/");
d1.findElement(By.id("register_Layer")).click();
d1.findElement(By.xpath("//span[text()='Google']")).click();

Set<String> parentandchildId=d1.getWindowHandles();
Iterator<String> i1=parentandchildId.iterator();
String p1=i1.next();  //first next() will display parent browser id.
String c1=i1.next();  //second next() will display first browser id
d1.switchTo().window(c1);
Thread.sleep(3000);
d1.findElement(By.id("identifierId")).sendKeys("1234567891");
d1.close();
d1.switchTo().window(p1);
d1.findElement(By.id("name")).sendKeys("Lalitha");
//f1.manage().deleteAllCookies();
Thread.sleep(3000);
d1.close();


}
}
