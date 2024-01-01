package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class GooglePf {

	WebDriver driver;

	@FindBy(xpath = "//textarea[@class='gLFyf']")
	WebElement googlesearch;

	public GooglePf(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);

	}

	By textname = By.xpath("//textarea[@class='gLFyf']");

	public void sendkeysl(String s) {

		googlesearch.sendKeys(s);

	}

}
