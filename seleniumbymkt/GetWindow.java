package seleniumbymkt;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindow {

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://grotechminds.com/");
		System.out.println(d1.getWindowHandle());
		System.out.println(d1.getWindowHandles());
	    d1.close();
	}

}
