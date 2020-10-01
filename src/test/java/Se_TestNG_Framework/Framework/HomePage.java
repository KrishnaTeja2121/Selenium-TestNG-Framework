package Se_TestNG_Framework.Framework;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.WhishListPage;

public class HomePage extends BaseClass
{
	
	@Test(dataProvider="getData")
	public void login(String Password) throws IOException, InterruptedException
	{
		driver= initializedriver();
		driver.get("https://www.myntra.com/");
	
		LandingPage ln= new LandingPage(driver);
		ln.getLogin().click();
		WhishListPage wl= new WhishListPage(driver);
		wl.getLogin().click();
		wl.getMobilenum().sendKeys(Password);
		wl.getcontinue().click();
		Assert.assertEquals(wl.getError().getText(), wl.getError().getText());
		System.out.println(wl.getError().getText());

				
	}
	
	@DataProvider
	public Object[][]  getData()
	{
		//Row value stands for how many different type of tests should run
		// column stands for number of type of data or how many values should pass for each test
		Object[][] data= new Object[2][1];
		//0th row
		data[0][0]= "123456";
		data[1][0]= "875453";
			
		
		return data;
		
		
				
	}
 

}
