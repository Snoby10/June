package junit1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demopgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{driver=new ChromeDriver();
	driver.get("https://google.com");	
	}
	@Test
	public void titileverification()
	{
		String actualtitle =driver.getTitle();
		String exptitle="Google";
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
			
		}}
		@Test
		public void textVerification()
		{
			String src=driver.getPageSource();
			if(src.contains("Gmail"))
			{

				System.out.println("Text is present");
				
			}
			else
			{
				System.out.println("Not present");
				}

		}
		@After
		public void close() {
			
			
		}
		
	
	

}
