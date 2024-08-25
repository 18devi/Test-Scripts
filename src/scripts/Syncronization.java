package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Syncronization {

	public static void main(String[] args) {
      System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.facebook.com");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("email")).sendKeys("hello");
      driver.findElement(By.id("pass")).sendKeys("123");
      driver.findElement(By.name("login")).click();
    
	}

}
