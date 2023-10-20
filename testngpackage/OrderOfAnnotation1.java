package testngpackage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderOfAnnotation1
{

@BeforeMethod
public void bm()
{
	System.out.println("BeforeMethod");	
}
@AfterMethod
public void am()
{
	System.out.println("AfterMethod");	
}
@Test
public void abc()
{
	System.out.println("@Test");		
}
@Test
public void zawe()
{
	System.out.println("@Test");		
}
}





