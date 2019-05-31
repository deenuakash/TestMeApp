package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example2 {
	WebDriver driver;
	
	@Given("user enters browser and provide url")
	public void user_enters_browser_and_provide_url() {
		System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com");
	}

	@When("user enters username And password")
	public void user_enters_username_And_password() {
		Pageobject obj=new Pageobject(driver);
		 obj.un.sendKeys("deenu");
		 obj.psd.sendKeys("qwerty123");

	}

	@Then("verify the result")
	public void verify_the_result() {
		Pageobject obj=new Pageobject(driver);
		obj.ok.click();
	}


}
