package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DimensionChange {

	public static void main(String[] args) throws InterruptedException {
		Dimension d = new Dimension(1600, 1280);
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().setSize(d);
	    driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("devikamamadapur@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Devika@18");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@title='Show products in category Accessories']/img")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='TCP Instructor Led Training']/../../td[6]/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='removefromcart']/../../../tr[1]/td[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();     
		Thread.sleep(2000);
//		WebElement Home_page = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//		 Dimension size = Home_page.getSize();
//		 System.out.println(size);
//		 int height = size.getHeight();
//		 int width = size.getWidth();
//		 System.out.println(height+" "+width);
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(2000);
		driver.quit();
        
	}

}
