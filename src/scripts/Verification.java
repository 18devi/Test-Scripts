package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verification {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("suekayeg");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("pass");
		Thread.sleep(1000);
		String error_msg = driver.findElement(By.xpath("//span[@for='Email']")).getText();
		Thread.sleep(1000);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(error_msg, "Please enter a valid email address");
		driver.findElement(By.id("RememberMe"));
		driver.quit();
		soft.assertAll();
	}
	
	
	

	
		
	
	


}
