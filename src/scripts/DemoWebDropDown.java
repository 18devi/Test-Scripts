package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoWebDropDown extends DemowebShopReview {

	public static void main(String[] args) throws InterruptedException
	{
		login();
		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[4]/a")).click();
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.id("products-orderby"));
		Select sel = new Select(product);
		sel.selectByIndex(1);
		WebElement product1 = driver.findElement(By.id("products-pagesize"));
		Select sel1 = new Select(product1);
		sel1.selectByIndex(2);
		WebElement product2 = driver.findElement(By.id("products-viewmode"));
		Select sel2 = new Select(product2);
		sel2.selectByIndex(1);
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../../div[3]/div[2]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/../../div[3]/div[2]/input ]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(1000);
	    WebElement jeans = driver.findElement(By.xpath("//a[text()='Blue Jeans']and @class='product_name'/../../td[6]/span[2]"));
		Thread.sleep(1000);
		String cost = jeans.getText();
        System.out.println(cost);
        double v = Double.parseDouble(cost);
        Thread.sleep(1000);
		WebElement belt = driver.findElement(By.xpath("//a[text()='Casual Golf Belt'and @class='product_name']/../../td[6]/span[2]"));
	    String cost1 = belt.getText();
        System.out.println(cost1);
        double v1 = Double.parseDouble(cost1);
        Thread.sleep(1000);
        if(v==v1)
        {
        	System.out.println("Both are same");
        	driver.findElement(By.name("continoueshopping")).click();
        }
        else
        {
        	driver.findElement(By.xpath("a[text()='Blue Jeans']and @class='product_name'/../../td[6]/span[2]"));
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//a[text()='Casual Golf Belt'and @class='product_name']/../../td[6]/span[2]"));
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();	
        }	

	}

}
