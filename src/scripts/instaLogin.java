package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class instaLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.instagram.com/login");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class='ico-login')")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("anjali");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='password]")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='login']")).click();
		
		
		
		
	
	}

}
