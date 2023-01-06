package TestNG;
import static browserlaunch.login.Browserlaunch.*;
import static driverutils.WebDriverUtils.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Inviteuser {
	
	WebDriver udriver;
	@Test
	public void testlogin() {
		
		WebElement username=driver.findElement(By.id("Username"));
	    WebElement password=driver.findElement(By.id("Password"));
	    WebElement login= driver.findElement(By.name("button"));
	    username.sendKeys("9578088335");
	    password.sendKeys("Test@123");
	    login.click();
	//   WebElement clinic= driver.findElement(By.xpath("//*[text()='SPA Hospital']"));
	//  clinic.click();
	@BeforeClass
	public void beforeclass() {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	     driver= new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.get("https://opd-dev.azurewebsites.net/");
	
}
