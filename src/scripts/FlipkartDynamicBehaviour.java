package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDynamicBehaviour {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.flipkart.com/");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[text()='✕']")).click();
      Thread.sleep(1000);
      WebElement fashaion = driver.findElement(By.xpath("//div[text()='Fashion']"));
      Actions act = new Actions(driver); 
      act.moveToElement(fashaion).perform();
      Thread.sleep(1000);
     // driver.findElement(By.xpath(""))
	}

}
