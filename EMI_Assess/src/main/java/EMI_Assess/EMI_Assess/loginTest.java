package EMI_Assess.EMI_Assess;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginTest {

WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
		
		public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("firefox")){
		
		System.setProperty("webdriver.gecko.driver","/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		
	}
	

	
		public loginTest() {
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.saucedemo.com/");
	
		driver.manage().window().maximize();
		
	}
}
