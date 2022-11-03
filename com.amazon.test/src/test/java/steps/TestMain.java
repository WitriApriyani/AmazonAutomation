package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.amazon.test.pages.Main;
import com.amazon.test.utils.Constants;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMain {
	private static WebDriver driver;
	private Main main = new Main();
	
	public TestMain() {
		driver = Hook.driver;
	}
	@When("navigate to url")
	public void navigate () {
//		driver.manage().deleteAllCookies();
		driver.get(Constants.url);
	}
	
	@And("click sidebar")
	public void sidebar () {
		main.clickSidebar();
	}
	
	@And("click electronic")
	public void electronic() {
		main.clickElectronic();
	}
	
	@And("click televisionvideo")
	public void televisionvideo() {
		main.clickTelevisionvideo();
	}
	
	@And("click television")
	public void television() {
		main.clickTelevision();
	}
	
	@And("click inchies")
	public void inchies() {
		main.clickInchies();
	}
	
	@And("click filter")
	public void filter() {
		main.clickFilter();
		delay(2);
	}
	
	@And("click price")
	public void price() {
		delay(1);
//		main.clickPrice();
//		delay(1);
//		main.clickmin();
		main.lowprice();
//		main.clickmax();
		main.highprice();
	}
	
	@And("click go")
	public void go() {
		main.clickGo();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
	
	}
	
	@And("click year")
	public void year() {
		main.clickYear();
	}
	
	@And("click product")
	public void product() {
		main.clickProduct();
	}
	
	
	@Then("print product detail")
	public void printProduct() {
		System.out.println("Product Name : " + main.getProductName());
		System.out.println("Product Price : " + main.getProductPrice());
	}
	
	@And("click add to list")
	public void addtolist() {
		main.clickAddtolist();
	}
	
	@Then("validate sign in page")
	public void validate_signin() {
		assertTrue(main.isSignin());
	}
	
	@And("input email")
	public void inputemail() {
		main.fillemail();
	}
	
	@And("click continue")
	public void lanjut() {
		main.clicklanjut();
	}
	
	@Then("validate site")
	public void validate_site() {
		assertEquals(main.getmsgerror(), "There was a problem");
		
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





