package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FlipkartInventoryCount {
@Test
public void flipkartInventoryCount() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("apple",Keys.ENTER);
	String actVal=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
	String [] arr=actVal.split(" ");
	int count = Integer.parseInt(arr[5].replaceAll(",", ""));
	System.out.println(count);
	
}
}
