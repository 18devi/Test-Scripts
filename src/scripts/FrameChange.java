package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameChange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(frame1);
	     String frame1_text = driver.findElement(By.id("sampleHeading")).getText();
	     System.out.println("Frame1:"+frame1_text);
	     driver.switchTo().defaultContent();
	     Thread.sleep(1000);
	     driver.switchTo().frame("frame2");
	     Thread.sleep(1000);
	     String frame2_text = driver.findElement(By.id("sampleHeading")).getText();
	     System.out.println("Frame2:"+frame2_text);
	     driver.switchTo().defaultContent();
	     driver.close();
	     
		
        
	}

}
