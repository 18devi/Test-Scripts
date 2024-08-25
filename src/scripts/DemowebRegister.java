package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemowebRegister {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-female']")).sendKeys("female");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Devika");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("R M");
		Thread.sleep(1000);
		driver.findElement(By.xpath("input[@name='Email']")).sendKeys("devika@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("devi@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("devi@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}
