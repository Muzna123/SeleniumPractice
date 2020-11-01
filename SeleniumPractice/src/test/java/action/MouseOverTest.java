package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverTest {
	@Test
	public void mouseOverDemo() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Actions act=new Actions(driver);
        WebElement dwb = driver.findElement(By.id("nav-link-accountList"));
		act.moveToElement(dwb).build().perform();
		driver.findElement(By.xpath("//span[text()='Find a Gift']")).click();
		//act.moveToElement(dwb).click().perform();
		//Thread.sleep(3000);
		
	}
}
