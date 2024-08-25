package scripts;

import javax.swing.text.html.CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLoginScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("hello@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("password");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}
