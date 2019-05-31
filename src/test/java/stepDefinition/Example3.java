package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Example3 {
	WebDriver driver;
	Pageobject obj=new Pageobject(driver);
	@Given("Enter login page of testmeapp")
	public void enter_login_page_of_testmeapp() {
	    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("enter {string} And {string}")
	public void enter_And(String na, String pwd) {
	    driver.findElement(By.name("userName")).sendKeys(na);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.linkText("Login")).click();
	}

	@Then("verify if it redirects to home page")
	public void verify_if_it_redirects_to_home_page() {
	    Assert.assertTrue(driver.getTitle().equals("Home"));
	}
}
