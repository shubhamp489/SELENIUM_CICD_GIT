package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	 WebDriver driver;	
	
	 
	public BaseClass() {
			System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://bonigarcia.dev/selenium-webdriver-java/index.html");
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	 
	

}
