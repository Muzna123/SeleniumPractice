package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest {
	@Test
	public void dragAndDrop() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.doubleClick(drag).perform();
		Thread.sleep(2000);
		act.contextClick(drag).perform();
		Thread.sleep(2000);
		//act.dragAndDrop(drag, drop).perform();
		act.clickAndHold(drag).moveToElement(drop).release().perform();
		
		
	}

}
