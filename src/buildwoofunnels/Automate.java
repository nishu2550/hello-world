package buildwoofunnels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

public class Automate {
	static WebDriver driver;

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./chd/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.buildwoofunnels.com/aerocheckout-demo/checkouts/beta11/");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	WebElement infoMail=driver.findElement(By.id("billing_email"));
	infoMail.sendKeys(" woofunnel6@gmail.com");
    WebElement checkbox=driver.findElement(By.id("createaccount"));
    checkbox.click();
    WebElement username=driver.findElement(By.id("account_username"));
    WebElement password=driver.findElement(By.id("account_password"));
    WebElement fname=driver.findElement(By.id("billing_first_name"));
    WebElement lname=driver.findElement(By.xpath("//input[@id='billing_last_name']"));
    WebElement company=driver.findElement(By.id("shipping_company"));
    WebElement streetadd=driver.findElement(By.id("shipping_address_1"));
    WebElement appart=driver.findElement(By.id("shipping_address_2"));
    WebElement city=driver.findElement(By.id("shipping_city"));
    WebElement postalCode=driver.findElement(By.id("shipping_postcode"));
    WebElement country=driver.findElement(By.id("select2-shipping_country-container"));
    WebElement state=driver.findElement(By.id("select2-shipping_state-container"));
    WebElement phone=driver.findElement(By.id("billing_phone"));
    Thread.sleep(10000);
    WebElement smethod=driver.findElement(By.xpath("//input[@id='shipping_method_0_local_pickup44']"));
    WebElement cardnumber=driver.findElement(By.id("stripe-card-element"));
    WebElement expdate=driver.findElement(By.id("stripe-exp-element"));
    WebElement cvc=driver.findElement(By.id("stripe-cvc-element"));
    WebElement terms=driver.findElement(By.id("terms"));
    WebElement submit=driver.findElement(By.id("place_order"));
    
    username.sendKeys("woofunnel6");
    password.sendKeys("onevoice123");
    fname.sendKeys("woofunnel6");
    lname.sendKeys("testingonly");
    company.sendKeys("bwf");
    streetadd.sendKeys("B1-632");
    appart.sendKeys("basement");
    city.sendKeys("Janakpuri");
    postalCode.sendKeys("66103");
    country.click();
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("document.getElementById('select2-shipping_country-container').value='canada;");
    
    country.sendKeys("canada");
    
    
    
Select cotry=new Select(country);
  cotry.selectByVisibleText("India");
  Select county=new Select(state);
  county.selectByVisibleText("Delhi");
  phone.sendKeys("9650993909");
  smethod.click();
  cardnumber.sendKeys("4242 4242 4242 4242");
  expdate.sendKeys("02/24");
  cvc.sendKeys("123");
  terms.click();
  submit.click();
  
    
    
    
    
    

	
	
}
}
