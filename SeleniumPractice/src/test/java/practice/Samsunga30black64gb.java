package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Samsunga30black64gb {
	@Test
public void samsunga30black64gb() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung mobiles",Keys.ENTER);
		Thread.sleep(1000);
		//driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys(Keys.CLEAR);
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("a30(black,64gb)",Keys.ENTER);
		Thread.sleep(1000);
		String x="//div[contains(text(),'Samsung Galaxy A30 (Black, 64 GB)')]/../../div[2]/div/div[1]/div";
		String price = driver.findElement(By.xpath(x)).getText();
		System.out.println(price);
		//driver.findElement(By.xpath("//div[contains(text(),'Samsung Galaxy A30 (Black, 64 GB)')]")).click();
	
}
}
