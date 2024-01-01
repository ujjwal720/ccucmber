package hoks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GooglePOM;
import Pages.GooglePf;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlgg {

	WebDriver driver = null;

	@Before
	public void setup() {
		
		System.out.println("this is before");

		System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("user is in goog page")
	public void user_is_in_goog_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com/");
	}

	@When("^user enters the (.*) in the se area$")
	public void user_enters_the_india_in_the_se_area(String t) {
		GooglePf a = new GooglePf(driver);
		a.sendkeysl(t);

	}

	@And("Clicks on gooe search")
	public void clicks_on_gooe_search() {
		// Write code here that turns the phrase above into concrete actions

		GooglePf a = new GooglePf(driver);
		a.sendkeysl(Keys.chord(Keys.ENTER));

	}

	@Then("user redi to google page")
	public void user_redi_to_google_page() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Test ended");

	}

	@After
	public void teardown() {
		
		
		System.out.println("this is an after");

		driver.quit();
	}

	@BeforeStep
	public void js() {

		System.out.println("This is an before step");
	}

	@AfterStep
	public void jsk() {
		
		System.out.println("this is an after step");

	}

}
