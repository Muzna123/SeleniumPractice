package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllUrlOfFavoriteData {
	@Test
	public void allUrlOfFavoriteData() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("favorite data",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		for(WebElement wb:list) {
			System.out.println(wb.getText());
		}
	}

}
