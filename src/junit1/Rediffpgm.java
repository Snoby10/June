package junit1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffpgm {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws InterruptedException
	{
		  WebElement dropdownElement =	driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		
		  Select dropdown = new Select(dropdownElement);
			dropdown.selectByVisibleText("06");
		
	}

}
