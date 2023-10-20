package seleniumbymkt;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		
ChromeDriver d1=new ChromeDriver();
d1.get("https://www.google.co.in/");
//d1.get("https://www.facebook.com/");
String title=d1.getTitle();
System.out.println(title);
//d1.close();
d1.quit();
	}

}
