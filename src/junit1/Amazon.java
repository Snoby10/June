package junit1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("http://www.amazon.in");}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();//
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span[1]")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
	}

}
//search mobiles in field,click hello signin//
//click cart click harmburger menu//
//driver.naviagte().back();
