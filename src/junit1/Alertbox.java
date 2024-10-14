package junit1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/asus/Documents/website2.html");
		

}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("html/body/input[1]")).click();;
     	Alert a=driver.switchTo().alert();
     	String alertbox= a.getText();
     	System.out.println("Alerttext="+alertbox);
     	a.accept();
		driver.findElement(By.name("firstname")).sendKeys("Snoby");
		driver.findElement(By.name("lastname")).sendKeys("Boby");
		
		
	}
}