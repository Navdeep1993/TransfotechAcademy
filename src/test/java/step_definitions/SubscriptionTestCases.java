package step_definitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.*;

public class SubscriptionTestCases {

	WebDriver  driver;


@Given("user is on blog detail page")
public void user_is_on_blog_detail_page() {
	System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
	this.driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.get("https://transfotechacademy.com/ethical-hacking-career-path/");
	
}


@When("user enter valid credientials")
public void user_enter_valid_credientials() {
	WebElement Email = driver.findElement(By.name("form_fields[email]"));
	Email.sendKeys("abc@gmail.com");
}

@And("hit enter")
public void hit_enter() {
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).build().perform();
}

@Then("user should see form sent successfully message")
public void user_should_see_form_sent_successfully_message() {
	WebElement actualResult = driver.findElement(By.xpath("//div[contains(text(),'sent successfully')]"));
	String AC = actualResult.getText();
	System.out.println(AC);
	String expectedResutl = "The form was sent successfully.";
	Assert.assertEquals("expectedResutl", "AC");
			   
}

@And ("press send button")
	public void press_send_button()
	{
		WebElement sendBtn = driver.findElement(By.tagName("button"));	
		sendBtn.click();
	}

@When("user enter invalid credientials")
public void user_enter_invalid_credientials() {
	WebElement Email = driver.findElement(By.name("form_fields[email]"));
	Email.sendKeys("12345678@fhhf.com");
}


@Then("user should see error message")
public void user_should_see_error_message() {
	WebElement actualResult = driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]"));
	String AC = actualResult.getText();
	System.out.println(AC);
	String expectedResutl = "This field is required.";
	Assert.assertEquals("expectedResutl", "AC");
			   
}


@When ("user enter email without dot")
public void user_enter_email_without_dot()
{
	WebElement Email = driver.findElement(By.name("form_fields[email]"));
	Email.sendKeys("12345678@fhhfcom");
	}


@When ("user enter email without top level domain")
public void user_enter_email_without_top_level_domain() 
{
	WebElement Email = driver.findElement(By.name("form_fields[email]"));
	Email.sendKeys("abc@gmail");
	
}
}

