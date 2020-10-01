	package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver ;
	
	By login =By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[1]/span[2]");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getLogin() 
	{
		return driver.findElement(login);
	}
}
