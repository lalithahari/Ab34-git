package testngpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {
static WebDriver driver;
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
}
}
