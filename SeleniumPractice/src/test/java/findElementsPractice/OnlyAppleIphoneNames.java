package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OnlyAppleIphoneNames {
	@Test
	public void onlyAppleIphoneNames() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone",Keys.ENTER);
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		System.out.println(list.size());
		for(WebElement wb:list)
			System.out.println(wb.getText());
		
		
		
	}

}
