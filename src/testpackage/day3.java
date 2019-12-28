package testpackage;

import org.testng.annotations.*;

public class day3 {
	
	@AfterClass
	public void WebLogin()
	{
		System.out.println("WebLogin");			
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		System.out.println("MobileLogin");	
	}
	
	@Test
	public void APILogin()
	{
		System.out.println("APILogin");	
	}

	@Test
	public void DBLogin()
	{
		System.out.println("DBLogin");	
	}

}
