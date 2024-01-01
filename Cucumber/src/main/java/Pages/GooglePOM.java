package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePOM {

	WebDriver driver;

	public GooglePOM(WebDriver driver) {

		this.driver = driver;

	}

	By textname = By.xpath("//textarea[@class='gLFyf']");

	public void sendkeysl(String s) {

		driver.findElement(textname).sendKeys(s);

	}

}
