package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MouseoureAction1 {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	      WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.myntra.com/");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//a[text()='Men' and @ data-group='men']")).sendKeys(Keys.TAB,"ENTER");

	}

}
