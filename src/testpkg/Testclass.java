package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Testclass {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("abc@gmail.com", "asfae");
		ob.loginclick();
				
		
	}

}
