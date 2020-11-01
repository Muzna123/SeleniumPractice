package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FlipkartAllMobileBrandNmaes {
	@Test
	public void flipkartAllMobileBrandNmaes() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement electronics=driver.findElement(By.xpath("//div[@id='container']/descendant::span[text()='Electronics']"));
		WebElement mob=driver.findElement(By.xpath("//div[@id='container']"
				+ "/descendant::span[text()='Electronics']/following-sibling::ul"
				+ "/descendant::a[@title='Mobiles']"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		//act.moveToElement(mob).click().perform();
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='container']"
		+ "/descendant::span[text()='Electronics']/following-sibling::ul"
		+ "/descendant::a[@title='Mobiles']/parent::li/following-sibling::li"));
		Thread.sleep(1000);
		
		for(WebElement wb:list)
			System.out.println(wb.getText());
		
	}

}
