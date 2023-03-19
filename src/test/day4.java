package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname)
	{
		//selenium
		System.out.println("WebloginHomepersonalLoan");
		System.out.println(uname);
	}

	@Test(groups={"Smoke"})
	public void MobileloginHomeLoan()
	{
		//Appium
		System.out.println("MobileloginHomeLoan");
	}
	
	@Test
	public void LoginApiHomeLoan()
	{
		//RestApi
		System.out.println("LoginApiHomeLoan");
	}
}
