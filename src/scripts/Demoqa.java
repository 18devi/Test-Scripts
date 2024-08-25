package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://demoqa.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//h5[text()='Forms']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Devika");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("devika@gmqil.com");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//label[text()='Female']/../../div[2]/input")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("5863472597");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//label[text()='Subjects']/../../div[2]")).sendKeys("hello");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//label[text()='Music']/../input")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Rajajinagar");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[2]/div/div/div[2]/div")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//div[@id='stateCity-wrapper']//div[3]/div/div/div[2]/div")).click();
    Thread.sleep(1000);
    //driver.findElement(By.xpath("//div[@id='adplus-anchor']"))
    //Thread.sleep(1000);
    
    
	}

}
