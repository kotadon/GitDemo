package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before executing any method in the class");
	}
	@Parameters({ "URL", "APIKey/Username" })
	@Test
	public void WebloginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("WebloginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void BeforeEveryMethod()
	{
		System.out.println("I will execute first before every test method in day 3 class");
	}
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("I will execute last after every test method in day 3 class");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After executing all method in the class");
	}
	@Test(groups={"Smoke"})
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobileLoginCarLoan");
	}
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am No 1");
	}
	@Test(enabled=false)
	public void MobilesigninCarLoan()
	{
		//Appium
		System.out.println("MobilesigninCarLoan");
	}
	
	@Test(dataProvider="getData")
	public void MobileSignoutCarLoan(String username,String password)
	{
		//Appium//Test(TimeOut =4000)
		System.out.println("MobileSignoutCarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan"})
	public void APICarLoan()
	{
		//RestApi
		System.out.println("ApiCarLoan");
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination- username password- good credit history
		//2nd combination- username password- no credit history
		//3rd combination- username password- fraud credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//2nd set
		data[1][0]="Secondsetusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="Thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}

