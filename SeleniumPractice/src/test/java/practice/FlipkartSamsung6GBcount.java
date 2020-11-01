package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartSamsung6GBcount {
	@Test
	public void flipkartSamsung6GBcount() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
		
//		 String text = driver.findElement(By.xpath("//span[contains(text(),'Showing ')]")).getText();
//		 System.out.println(text);
//		 String[] textArr = text.split(" ");
//		 String count = textArr[5];
//		 System.out.println(Integer.parseInt(count));
	}

}
