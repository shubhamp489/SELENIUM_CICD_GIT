package stepDefination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class DropdownPage extends BaseClass{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	Actions builder = new Actions(driver);
	
	@Given("click on dropdown menu")
	public void click_on_dropdown_menu() {
	    driver.findElement(By.xpath("//a[contains(text(),'Dropdown menu')]")).click();
	}
	@Then("click on Use left-click here")
	public void click_on_use_left_click_here() {
	 WebElement dropdown2=driver.findElement(By.xpath("//button[@id='my-dropdown-2']"));
	 Action rightClick=builder.contextClick(dropdown2).build();
	 rightClick.perform();
	}
	@Then("get all the value from drop down list")
	public void get_all_the_value_from_drop_down_list() {
	    List<WebElement> tag=driver.findElements(By.xpath("//ul[@id='context-menu-2']/li/a"));
	    for(WebElement web: tag) {
	    	System.out.println(web.getText());
	    	if(web.getText().equals("Another action")) {
	    		web.click();
	    		
	    	}
	    }
	    System.out.println(tag.size());
	    //driver.quit();
	}

	
}
