package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DummyDropDown {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("file:///C:/Users/Hp/Desktop/Droupdown.html");
	     Thread.sleep(1000);
	     WebElement drop_down = driver.findElement(By.id("//select[@id='country_dropdown']"));
	     Select sel = new Select(drop_down);
	     if(sel.isMultiple())
	     {
	    	 System.out.println("multiselect");
	    	 sel.selectByIndex(0);
	    	 Thread.sleep(1000);
	    	 sel.selectByValue("B");
	    	 Thread.sleep(1000);
	    	 sel.selectByVisibleText("Spain");
	     }
	     else
	     {
	    	 sel.selectByIndex(5);
	     }
	     driver.quit();
	}

}
