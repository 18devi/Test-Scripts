package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebMousehour extends DemowebShopReview {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Show products in category Camera, photo']/../../../../div[1]")).click();
        Thread.sleep(2000);
        WebElement product = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(product);
		sel.selectByIndex(3);
		WebElement product1 = driver.findElement(By.id("products-pagesize"));
		Select sel1 = new Select(product1);
		sel1.selectByIndex(2);
		WebElement product2 = driver.findElement(By.id("products-viewmode"));
		Select sel2 = new Select(product2);
		sel2.selectByIndex(1);
	    driver.findElement(By.xpath("//a[text()='Camcorder']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//h1[@itemprop='name']/../../div[4]/div[2]/a[2]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("Good");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("hello");
	    Thread.sleep(1000);
	    
	    
		   
	}

}
