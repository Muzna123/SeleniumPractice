package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickTest {
	@Test
	public void rightClickTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("tendulkar", Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement wb = driver.findElement(By.xpath("//h3[text()='Sachin Tendulkar - Wikipedia']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).perform();
		Thread.sleep(3000);
		act.sendKeys("t").build().perform();
	}
}
