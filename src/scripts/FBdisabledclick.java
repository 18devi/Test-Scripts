package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FBdisabledclick {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.facebook.com/r.php");
		    Thread.sleep(1000);
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    WebElement custom_btn = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		    js.executeScript("arguments[0].value='hii;'",custom_btn);
	}

}
