package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UrbanLadder {
	@Test
	public void urbanLadder() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		List<WebElement> MainMenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']"
				+ "/descendant::span[@class='topnav_itemname']"));
		Thread.sleep(1000);
		for (WebElement l1:MainMenu) {
			System.out.println(l1.getText());
			act.moveToElement(l1).perform();
			Thread.sleep(1000);
			System.out.println("-----------------------------");
			List<WebElement> Submenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']"
					+ "/descendant::span[contains(.,'"+l1.getText()+"')]"
							+ "/parent::li/descendant::div[@class='taxontype']/a"));
			Thread.sleep(1000);
			for (WebElement l2:Submenu) {
				System.out.println(l2.getText());
				//act.moveToElement(l2).perform();
				Thread.sleep(1000);
				
				List<WebElement> innerMenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'\"+l1.getText()+\"')]"
						+ "/parent::li/descendant::div[@class='taxontype']/a[text()='"+l2.getText()+"']//ancestor::li[@class='sublist_item']//ul[@class='taxonslist']//span"));
				Thread.sleep(1000);
                 for(WebElement l3:innerMenu) {
                	 System.out.println(l3.getText());
                	 Thread.sleep(1000);
                	 System.out.println("---------------------------------");
                 }
			}
		}
	}
}
