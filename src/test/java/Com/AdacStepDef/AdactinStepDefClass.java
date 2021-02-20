package Com.AdacStepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdactinStepDefClass {
	WebDriver driver;
	@Given("User is on Adactin login page")
	public void user_is_on_Adactin_login_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chellappa\\eclipse-workspace\\Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

@When("user enter {string} and {string}")
public void user_enter_and(String string, String string2) {
    WebElement a = driver.findElement(By.id("username"));
  
	a.sendKeys(string);
	WebElement aa = driver.findElement(By.id("password"));
	aa.sendKeys(string2);
}

@When("user should click button")
public void user_should_click_btn() {
	WebElement b = driver.findElement(By.id("login"));
	b.click();
	
	
}

@When("user should select LOCATION {string}")
public void user_should_select_LOCATION(String string) {
WebElement aa = driver.findElement(By.id("location"));

Select s = new Select(aa);
s.selectByVisibleText(string);
}

@When("user should select HOTELS {string}")
public void user_should_select_HOTELS(String string) {
WebElement aa = driver.findElement(By.id("hotels"));

   Select s = new Select(aa);
   s.selectByVisibleText(string);

}

@When("user should select ROOMTYPE {string}")
public void user_should_select_ROOMTYPE(String string) {
WebElement aa = driver.findElement(By.id("room_type"));

   Select s = new Select(aa);
   s.selectByVisibleText(string);


}

@When("user should select NUMBER OF ROOMS {string}")
public void user_should_select_NUMBER_OF_ROOMS(String string) {
WebElement aa = driver.findElement(By.id("room_nos"));

   Select s = new Select(aa);
   s.selectByVisibleText(string);

}

@When("user should select ADULTS PER ROOM {string}")
public void user_should_select_ADULTS_PER_ROOM(String string) {
WebElement aa = driver.findElement(By.id("adult_room"));

   Select s = new Select(aa);
   s.selectByVisibleText(string);

}

@When("user should select CHILDRENS PER ROOM {string}")
public void user_should_select_CHILDRENS_PER_ROOM(String string) {
WebElement aa = driver.findElement(By.id("child_room"));

   Select s = new Select(aa);
   s.selectByVisibleText(string);

}
@Then("user should click search btn")
public void user_should_click_search_btn() {
driver.findElement(By.id("Submit")).click();
}
}
	