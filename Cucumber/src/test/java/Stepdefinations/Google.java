package Stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GooglePOM;
import Pages.GooglePf;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	
	WebDriver driver=null;
	
	
	@Given("user is in google page")
	public void user_is_in_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C:\\ch\\chromedriver-win64\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com/");
	}

	@When("^user enters the (.*) in the search area$")
	public void user_enters_the_text_in_the_search_area(String text) {
	    // Write code here that turns the phrase above into concrete actions
		GooglePf a =new GooglePf(driver);
	       a.sendkeysl(text);
	       
	}

	@And("Clicks on google search")
	public void clicks_on_google_search() {
	    // Write code here that turns the phrase above into concrete actions
		GooglePf a =new GooglePf(driver);
		a.sendkeysl(Keys.chord(Keys.ENTER));
	}

	@Then("user redirects to google page")
	public void user_redirects_to_google_page() {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	  System.out.println("clos eit");
	     driver.close();
	     driver.quit();
	}


}
