package scripts;

import java.nio.channels.ServerSocketChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptVisible {
         public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		 WebElement search_bar=driver.findElement(By.xpath("//input[@name='q']"));
		 if(search_bar.isDisplayed())
		 {
			 search_bar.sendKeys("Displayed");
		 }
		 else
		 {
			 System.out.println("Not displayed");
		 }
     	 WebElement lgn_btn = driver.findElement(By.xpath("//a[text()='login']"));
		if(lgn_btn.isEnabled())
		 {
		 lgn_btn.click();
		 }
		 
		 {
			 System.out.println("Disabled");
		 }
	}

		
}

		


