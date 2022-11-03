package com.amazon.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.test.driver.driver.DriverSingleton;

public class Main {
	
	private WebDriver driver;
	
	public Main() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]")
	private WebElement sidebar;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[7]")
	private WebElement electronic;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[15]")
	private WebElement televisionvideo; 
	
	@FindBy(xpath="//*[@id=\"n/172659\"]/span/a")
	private WebElement televisions;
	
	@FindBy(xpath="//*[@id=\"p_n_size_browse-bin/1232879011\"]/span/a/span")
	private WebElement inchies;
	
	@FindBy(xpath="//*[@id=\"a-autoid-2-announce\"]")
	private WebElement filter;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/div[1]/ul[1]/li[3]/a[1]\n"
			+ "")
	private WebElement price;
	
	@FindBy(id="low-price")
	private WebElement lowprice;
	
	@FindBy(id="high-price")
	private WebElement highprice;
	
	@FindBy(xpath="//*[@id=\"p_36/price-range\"]/span/form/span[3]/span/input")
	private WebElement go;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[6]/ul[2]/li[4]/span/a/div/label/i")
	private WebElement year;
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div[2]/div[1]/h2/a")
	private WebElement product;
	
	@FindBy(xpath="//*[@id=\"wishListMainButton\"]")
	private WebElement addtolist;
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	private WebElement lanjut;
	
	@FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div/h4")
	private WebElement msgerror;
	
	@FindBy(id="title")
	private WebElement productName;
	
	@FindBy(xpath="//*[@id=\"corePrice_feature_div\"]/div/span/span[2]")
	private WebElement productPrice;
	
		
	public void clickSidebar() {
		delay(1);
		sidebar.click();
	}
	
	public void clickElectronic() {
		delay(1);
		electronic.click();	
	}
	
	public void clickTelevisionvideo() {
		delay(1);
		televisionvideo.click();
	}
	
	public void clickTelevision() {
		delay(1);
		televisions.click();
	}
	
	public void clickInchies() {
		delay(1);
		inchies.click();
	}
	
	public void clickFilter() {
		delay(1);
		filter.click();
	}
	
//	public void clickPrice() {
//		delay(1);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", price);
//		delay(1);
//		price.click();
//	}
//	
//	public void clickmin() {
//		delay(3);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lowprice);
//		delay(1);
//		lowprice.click();
//	}
	
	public void lowprice() {
		delay(1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", highprice);
		delay(1);
		lowprice.sendKeys("0");
	}


//	public void clickmax() {
//		delay(1);
//		highprice.click();
//	}
	
	public void highprice() {
		delay(2);
		highprice.sendKeys("150");
	}
	
	public void clickGo() {
		delay(1);
		go.click();
	}
	
	public void clickYear() {
		delay(1);
		year.click();
	}
	
	public String getProductName() {
		return productName.getText();
	}
	
	public String getProductPrice() {
		return productPrice.getText();
	}
	
	public void clickProduct() {
		delay(1);
		product.click();
	}
	
	public void clickAddtolist() {
		delay(2);
		addtolist.click();
	}
	
	public boolean isSignin() {
		return email.isDisplayed();
	}
	
	public void fillemail() {
		delay(1);
		email.sendKeys("witri@gmail.com");
	
	}
	
	public void clicklanjut() {
		delay(1);
		lanjut.click();
	}
	
	public String getmsgerror() {
	return msgerror.getText();
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
