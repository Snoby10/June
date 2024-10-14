package junit1;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
}
@Test
public void test() throws IOException
{
	
	WebElement button=driver.findElement(By.name("login"));
	File src1=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("./snoby/buttonss.png"));
	}

}