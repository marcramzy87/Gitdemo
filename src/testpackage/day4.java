package testpackage;

import org.testng.annotations.*;

public class day4 {
	
	@Test(dependsOnMethods= {"Motorcycles"})
	public void NewCars()
	{
		System.out.println("New Cars");			
	}
	@Parameters({"URL","Title"})
	@Test //(enabled=false)
	public void UsedCars(String urlname, String title)
	{
		System.out.println("Used Cars");	
		System.out.println(urlname);	
		System.out.println(title);
	}
	
	@Test(dataProvider="getData")
	public void Motorcycles(String username, String password)
	{
		System.out.println("Motorcycles");	
		System.out.println(username+ " and "+password);	
	}
	@Test(timeOut=4000)
	public void ads()
	{
		System.out.println("ads");			
	}

	@Test
	public void helloCars()
	{
		System.out.println("Hello Cars");			
	}

	@Test
	public void helloWorld()
	{
		System.out.println("Hello World");			
	}

	@Test
	public void helloMotorcycles()
	{
		System.out.println("Hello Motorcycles");			
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0]= "firstusername";
		data[0][1]= "firstpassword";
		data[1][0]= "secondusername";
		data[1][1]= "secondpassword";
		data[2][0]= "thirdusername";
		data[2][1]= "thirdpassword";
		
		return data;
	}
	
}
