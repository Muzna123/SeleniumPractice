package windowOrPopupHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTabWindow {
	@Test
	public void newTabWindow() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Apple iPhone 7 (Black, 32 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Apple iPhone 11 (White, 64 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Apple iPhone 11 (Black, 64 GB)']")).click();
		Thread.sleep(2000);
		String expPage="Apple iPhone 11";
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			Thread.sleep(2000);
			String actPage=driver.getTitle();
			System.out.println(actPage);
			if(actPage.contains(expPage)) {
				driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
				Thread.sleep(2000);
			break;
				}
		}
		
		driver.switchTo().window(parentHandle);
		Thread.sleep(1000);
		
		
	}

}
