package junit1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletest {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
		
		
@Test
public void test()
{
	driver.findElement(By.id("APjFqb")).sendKeys("Facebook",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();//
	}
}
