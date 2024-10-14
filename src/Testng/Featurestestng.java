package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Featurestestng {
	@BeforeTest
	public void setup()
	{
		System.out.println("Before test");
		
	}
	@BeforeMethod
	public void test()
	{
		System.out.println("Before method");
		
		
	}
	@Test(groups = {"smoke,sanity"})
	public void test1()
	{
		System.out.println("Test1");
		
	}
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("Test2");
		
	}
	@Test(groups = {"sanity"})
	public void test3()
	{
		System.out.println("Test3");
		
	}
	@Test(groups = {"sanity"})
	public void test4()
	{
		System.out.println("Test4");
		
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
@AfterTest
public void aftertest()
{
	System.out.println("after test");
	}





}
