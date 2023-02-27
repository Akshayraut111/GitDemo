package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class1 {

	static WebDriver driver;
	
	public static WebDriver getDriver(String browser)
	{
	
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://zerodha.com/products/kite");
		driver.manage().window().maximize();
		return driver;
	}
	
}
