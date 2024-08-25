package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        WebElement text_field = driver.findElement(By.id("email"));
        text_field.sendKeys("Hello world");
        Thread.sleep(1000);
        text_field.sendKeys(Keys.CONTROL+"a");
        Thread.sleep(1000);
        text_field.sendKeys(Keys.BACK_SPACE);
	}
}

