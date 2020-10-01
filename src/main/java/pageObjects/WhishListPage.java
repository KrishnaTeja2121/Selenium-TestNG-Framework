	package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhishListPage {

	
	public WebDriver driver ;
	
	By login =By.xpath("//*[@id=\"mountRoot\"]/div/div/div/div/div[4]/a");
	By num= By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input");
	By cont= By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[2]");
	By Error= By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/div");
	public WhishListPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}

	public WebElement getLogin() 
	{
		return driver.findElement(login);
	}
	
	public WebElement getMobilenum()
	{
		return driver.findElement(num);
	}
	public WebElement getcontinue()
	{
		return driver.findElement(cont);
	}
	public WebElement getError()
	{
		return driver.findElement(Error);
	}
}
