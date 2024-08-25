package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHourAction {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.myntra.com/");
      Thread.sleep(1000);
      WebElement mens_tab = driver.findElement(By.xpath("//a[text()='Men' and @ data-group='men']"));
      Actions act = new Actions(driver);
      act.moveToElement(mens_tab).perform();
      Thread.sleep(1000);
      WebElement t_shirts = driver.findElement(By.xpath("//a[text()='T-Shirts' and @href='/men-tshirts']"));
      Actions act1 = new Actions(driver);
      act.moveToElement(t_shirts).click().perform();
      
	
	}

}
