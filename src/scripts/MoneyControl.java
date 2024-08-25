package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class MoneyControl {

	public static void main(String[] args) throws InterruptedException  {
        System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.moneycontrol.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='http://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php' and @title='Top Gainers']/../../../div/div[2]/table/tbody/tr[1]")).click();
        
	}

}
