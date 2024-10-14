package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontab {
	WebDriver d;
	@BeforeTest 
	public void setup() {
		d=new ChromeDriver();
		
	}
	@Test
	public void test()
	
	{ d.get("https://www.amazon.in/");
		d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile Phones",Keys.ENTER);
		
		String expectedtitle="Mobiles";
		String actualtitle=d.getTitle();
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		d.findElement(By.xpath(""));
	
	}
	}


