package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rm_devika");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("devika@18");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Not Now']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Messages']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='p®í¥å❤']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Message']")).sendKeys("Hello");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(3000);
		
	}
}
