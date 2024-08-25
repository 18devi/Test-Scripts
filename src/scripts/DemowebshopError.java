package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemowebshopError {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("devi@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Devika");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        WebElement error = driver.findElement(By.xpath("//span[contains(text(), 'unsuccessful')]"));
         String text = error.getText();
        System.out.println(text);
        
	}
}
