package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemowebShopReview {
	
	public static WebDriver driver;
	public static void login() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
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
        
        
        
	
	
	}

}
