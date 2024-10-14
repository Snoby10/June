package junit1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		
	}

}
