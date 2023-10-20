package testngpackage;

import org.testng.annotations.Test;

public class Enabled {
	@Test(enabled=false)
	public void testcase1()      
	{
	
	}
	@Test
	public void testcase2()
	{
	
	}
	@Test(invocationCount=10)
	public void testcase3()
	{
	
	}

}
