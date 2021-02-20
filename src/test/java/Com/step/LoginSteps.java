package Com.step;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class LoginSteps {

	WebDriver driver;

	@Given("User is on Adactin page")

	public void user_is_on_Adactin_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Chellappa\\eclipse-workspace\\Cucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}
	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("Cksujith");
		driver.findElement(By.id("password")).sendKeys("Ck@1234");
	}
	@When("should click the login button")
	public void should_click_the_login_button() {
		driver.findElement(By.id("login")).click();
	}
	@When("check redirects to booking module")
	public void check_redirects_to_booking_module() {
		String cUrl = driver.getCurrentUrl();
		boolean b = cUrl.contains("SearchHotel");
		Assert.assertTrue("verify search Hotels", b);
	}

}
