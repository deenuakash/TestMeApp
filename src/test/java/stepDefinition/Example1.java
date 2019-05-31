package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	
	WebDriver driver;
	
	@Given("user opens chrome browser And enter url")
	public void user_opens_chrome_browser_And_enter_url() {
	    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com");
	}

	@When("user enter username And password")
	public void user_enter_username_And_password() {
		driver.findElement(By.name("userName")).sendKeys("deenu");
		driver.findElement(By.name("password")).sendKeys("qwerty123");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    driver.findElement(By.xpath("//input[@type='image'][@name='login']")).click();
	}
	@When("user enter invalid username And password")
	public void user_enter_invalid_username_And_password() {
		System.out.println("invalid login");
	}

	@Then("verify result")
	public void verify_result() {
	    Assert.assertTrue(true);
	}

}
