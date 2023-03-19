package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo()
		// TODO Auto-generated method stub
		{
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am Last");
		
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}
		}
