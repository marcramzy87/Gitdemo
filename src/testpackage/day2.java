package testpackage;

import org.testng.annotations.*;

public class day2 {
	
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
		System.out.println("Bye");
	}
	

	@Test
	public void ThirdTest()
	{
		System.out.println("Hello Third Test");
	}
	@BeforeTest
	public void prerequistes()
	{
		System.out.println("I will execute first");
	}

}
