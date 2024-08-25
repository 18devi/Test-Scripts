package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myntrashoes {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
//      driver.manage().window().maximize();
      driver.get("https://www.myntra.com/");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("women shoes");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//a[@class='desktop-submit']/span")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//div[@class='product-sliderContainer']/../../../../li[5]")).click();    
      
      
	}

}
