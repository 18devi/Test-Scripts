package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkartlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//form[@autocomplete='on']/div[1]/input")).sendKeys("8088800356");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[1]/input")).sendKeys("1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[2]/input")).sendKeys("4");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[3]/input")).sendKeys("3");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[4]/input")).sendKeys("9");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[5]/input")).sendKeys("2");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()='Please enter the OTP sent to']/../form/div[1]/div[6]/input")).sendKeys("7");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Verify']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Samsung galaxy mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		Thread.sleep(2000);
		
		
		
	}

}
