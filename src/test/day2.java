package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest
	public void prerequest()
	{
		System.out.println("I will execute first");
	}
	
	@AfterTest
	public void postrequest()
	{
		System.out.println("I will execute Last");
	}
}

