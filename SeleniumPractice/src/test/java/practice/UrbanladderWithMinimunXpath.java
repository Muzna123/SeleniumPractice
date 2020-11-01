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

public class UrbanladderWithMinimunXpath {
	@Test
	public void urbanladderWithMinimunXpath() throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com");
		Actions act=new Actions(driver);
		WebElement close=driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
		Thread.sleep(1000);
		List<WebElement> links=driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		for(WebElement l:links) {
			System.out.println(l.getText());
			System.out.println("--------------");
			act.moveToElement(l).perform();
			Thread.sleep(1000);
			List<WebElement> submenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'"+l.getText()+"')]"
					+ "/parent::li/descendant::div[@class='taxontype']/a"));
			for(WebElement l1:submenu) {
				System.out.println(l1.getText());
				System.out.println("-------------------");
				List<WebElement> innermenu=driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(.,'\"+l.getText()+\"')]\"\r\n" + 
						"					+ \"/parent::li/descendant::div[@class='taxontype']/a[text()='"+l1.getText()+"']//ancestor::li[@class='sublist_item']//ul[@class='taxonslist']//span"));
				for(WebElement I2:innermenu) {
					System.out.println(I2.getText());
				}
			}
		}
	}

}
