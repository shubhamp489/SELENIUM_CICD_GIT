package stepDefination;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;

public class WebFormPage extends BaseClass {
	//private WebDriver driver;
	
	@Given("Open google chrome")
	public void open_google_chrome() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Web form')]")).click();
		WebElement name =wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#my-text-id")));
				name.sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@name='my-password']")).sendKeys("Pandey");
		
		WebElement dropdown=driver.findElement(By.className("form-select"));
		Select  select = new Select(dropdown);
		select.selectByValue("2");
		select.selectByVisibleText("Three");
		List<WebElement> l1= select.getOptions();
		for(WebElement wb : l1) {
			System.out.println(wb.getText());
			if(wb.getText().equals("One")) {
				wb.click();
			}
		}
		driver.findElement(By.xpath("//textarea[contains(@name,'my-textarea')]")).sendKeys("A quick brown fox jumps on the lazy dog");
		
		driver.findElement(By.xpath("//input[contains(@name,'my-datalist')]")).sendKeys("New York");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,500)");
		//WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[contains(text(),'Submit')]"))));
		//submit.click();
		//String actual = driver.findElement(By.cssSelector(".lead")).getText();
		//String Expected="Received";
		//assertEquals(actual,Expected);
	}
}
