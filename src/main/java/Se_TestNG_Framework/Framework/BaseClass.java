package Se_TestNG_Framework.Framework;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
public WebDriver driver;
	
public WebDriver initializedriver() throws IOException
{
Properties prop= new Properties();
FileInputStream fis= new FileInputStream("C:\\Users\\krish\\eclipse-workspace\\Framework\\src\\main\\java\\Se_TestNG_Framework\\Framework\\Data.properties");

prop.load(fis);

String BrowserName = prop.getProperty("browser");

if (BrowserName.equals("Chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\Selenium softwares\\chromedriver.exe");
	driver= new ChromeDriver();
}
else if (BrowserName.equals("Firefox"))
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\krish\\Downloads\\Selenium softwares\\geckodriver-v0.27.0-win64");
	 driver= new FirefoxDriver();
}
else if (BrowserName=="IE")
{
	//
}

driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

return driver;
		
		
}
}
