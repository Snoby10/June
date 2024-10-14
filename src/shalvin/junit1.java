package shalvin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit1 {

	ChromeDriver driver;
	@Before
	public void setuo() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	@Test
	public void test1(){
	String act	=driver.getTitle();
	String exp="Google";
	if(act.equals(exp)) {
		System.out.println("tittle success");
	}
	else {
		System.out.println("failure");
	}
		
	}
	
	@Test
	public void test2() {
		String exp1 =driver.getPageSource();
		String act1="Gmail";
		
		if(exp1.contains(act1)) {
			System.out.println("text sucess");
		}else {
			System.out.println("failure");
		}
	}

	@After
	public void after1() {
		driver.close();
	}
	}


