package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HighLightGmailLoginElements {
	@Test
	public void verifyInvalidEmail() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gmail.com");
		WebElement wb = driver.findElement(By.id("identifierId"));
		HighLightElements.highLightElement(driver, wb);
		wb.sendKeys("muznashaikh89");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		/*WebElement wb1=driver.findElement(By.name("password"));
		HighLightElements.highLightElement(driver, wb1);
		wb.sendKeys("");*/
		

	}
}
