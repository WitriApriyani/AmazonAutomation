package steps;

import org.openqa.selenium.WebDriver;

import com.amazon.test.driver.driver.DriverSingleton;
import com.amazon.test.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	
	public static WebDriver driver;
	
	@Before
	public void setup() {
		DriverSingleton.getInstance(Constants.Chrome);
		driver = DriverSingleton.getDriver();
	}
	
	@After
	public void closeObject() {		
		delay(3);
		DriverSingleton.closeObjectInstance();
	}
	
	static void delay(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}