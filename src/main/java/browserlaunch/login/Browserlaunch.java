package browserlaunch.login;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Browserlaunch {

	public static WebDriver driver;
	@Test
	public static WebDriver LaunchURL() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	     driver= new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://opd-dev.azurewebsites.net/");
	    
	    return driver;

}
	}

