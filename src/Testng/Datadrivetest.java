package Testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivetest {
		ChromeDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("http://www.facebook.com");
			
		}
		@Test
		public void test() throws Exception
		{
			FileInputStream f= new FileInputStream("C:\\Users\\asus\\Documents\\Book2.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet sh=wb.getSheet("sheet1");
			int row=sh.getLastRowNum();
			for(int i=1;i<=row;i++)
			{
				String username=sh.getRow(i).getCell(0).getStringCellValue();
				String pswd=sh.getRow(i).getCell(1).getStringCellValue();
				System.out.println(username+"_____"+pswd);
				driver.findElement(By.name("email")).sendKeys(username);
				driver.findElement(By.name("pass")).sendKeys(pswd);
				driver.findElement(By.name("login")).click();
			}
					
			
		}

}
