package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class Fbloginpage {
	WebDriver driver;
	By fbemail=By.name("email");
	By fbpsd=By.name("pass");
	By fbloginbutton=By.name("login");
	public Fbloginpage( WebDriver driver)
	{
		this.driver=driver;
	}
	public void setValues(String email,String password)
	{
		driver.findElement(fbemail).sendKeys(email);;
		driver.findElement(fbpsd).sendKeys(password);;
		
	}
	public void loginclick()
	{
		driver.findElement(fbloginbutton).click();
	}

}
