package Test_class;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import Base_class.Base_class1;

public class Login_to_zerodha {
	WebDriver driver;
	//@Parameter("browser")
	@BeforeClass
	public void beforeClass( )
	{
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		driver = Base_class1.getDriver("chrome");
	}
	
	@BeforeClass
	public void beforeClass2( )
	{
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		System.out.println("develop branch");
		driver = Base_class1.getDriver("chrome");
		System.out.println("here also changing");
	}
}
