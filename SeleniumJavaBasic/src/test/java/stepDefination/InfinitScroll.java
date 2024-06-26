package stepDefination;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class InfinitScroll extends BaseClass {


@Given("Navigate to the middle of the page")
public void navigate_to_the_middle_of_the_page() throws InterruptedException {
	driver.findElement(By.xpath("//a[text()='Infinite scroll']")).click();
	Thread.sleep(1000);
  JavascriptExecutor js = (JavascriptExecutor) driver;   
  //WebElement wb = driver.findElement(By.xpath(""));
  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
  js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
  Thread.sleep(2000);
  js.executeScript("window.scrollTo(0,0);");
  
  //js.executeScript("arguments[0].scrollIntoView(true);",wb);
  
}


	
}
