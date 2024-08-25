package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("email")).sendKeys("Hello world");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("password123");
        Thread.sleep(1000);
        WebElement d = driver.findElement(By.name("login"));
        d.submit();
        
        
        
        
        
	}

}
