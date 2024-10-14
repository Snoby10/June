package junit1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linklist {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}
	@Test
	public void test() 
	{
		List <WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("total links="+linklist.size());
		
		for (WebElement linklist1 : linklist
				) {
            String linkText = linklist1.getText();
            
            String linkHref = linklist1.getAttribute("href");
            
            System.out.println("Link Name: " + linkText);
            
            System.out.println("Link URL: " + linkHref);
            System.out.println();
            verifylink(linkText);
        }
    }
	private void verifylink(String linkText)  {
		
try {
	URI ob=new URI(linkText);
	HttpURLConnection  con=(HttpURLConnection)ob.toURL().openConnection();
	if(con.getResponseCode()==200)
	{
		System.out.println("Response code");
		
		}
	else if(con.getResponseCode()==404)
	{
		System.out.println("Broken link");
	}
	
} catch (Exception e) {
System.out.println(e.getMessage());
}	

		
	}
	
   

	} 

