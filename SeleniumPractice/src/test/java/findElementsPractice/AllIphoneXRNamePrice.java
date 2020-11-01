package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AllIphoneXRNamePrice {
	@Test
	public void allIphoneXRNamePrice() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone XR",Keys.ENTER);
		Thread.sleep(5000);
		String x="//span[contains(text(),'Apple iPhone XR')]";
		List<WebElement> list = driver.findElements(By.xpath(x));
		 List<WebElement> price = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone XR')]"
		 		+ "/ancestor::div[@class='sg-col-inner']"
		 		+ "/descendant::span[@class='a-price-whole']"));
		 System.out.println(list.size());
	
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i).getText()+"---"+price.get(i).getText());
		
		}
		
	}

}
