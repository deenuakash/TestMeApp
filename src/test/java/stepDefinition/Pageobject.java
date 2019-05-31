package stepDefinition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {
	//public static WebDriver driver;
	public Pageobject(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='userName']")
	public static WebElement un;
	@FindBy(name="password") 
	public static WebElement psd;
	@FindBy(xpath="//input[@value='Login']") 
	public static WebElement ok;
}
