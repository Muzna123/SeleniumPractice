package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ConcurrentKeyBoardOpsTest {
	@Test
	public void concurrentKeyBoardOps() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
		WebElement wb=driver.findElement(By.name("user_name"));
		wb.sendKeys("admin");
		Actions act=new Actions(driver);
		act.doubleClick(wb).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL+"c").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.CONTROL+"v").build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}

}
