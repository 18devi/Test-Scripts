package scripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWebbigproject extends Screenshot {

	public static WebDriver driver ; 
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//a[text()='Log in']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("devikamamadapur@gmail.com");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Devika@18");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@value='Log in']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();
	 Thread.sleep(2000);
	 WebElement product = driver.findElement(By.id("products-orderby"));
	 Select sel = new Select(product);
	 sel.selectByIndex(1);
	 WebElement product1 = driver.findElement(By.id("products-pagesize"));
	 Select sel1 = new Select(product1);
	 sel1.selectByIndex(2);
	 WebElement product2 = driver.findElement(By.id("products-viewmode"));
	 Select sel2 = new Select(product2);
	 sel2.selectByIndex(1);
	 driver.findElement(By.xpath("//a[@href='/50s-rockabilly-polka-dot-top-jr-plus-size']/../../div[1]/a/img")).click();
    Thread.sleep(2000);
    WebElement msg = driver.findElement(By.xpath("//div[@id='bar-notification']"));
    if(!msg.isDisplayed())
    {
    	System.out.println("displayed");
    }
    else
    {
    	Screenshot(driver);
    }
    
    
    	 
    	
	}
}
	
		
	


