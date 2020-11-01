package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExplicit {
@Test
public void waitExplicit() {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://accounts.google.com/signin");
	driver.findElement(By.id("identifierId")).sendKeys("muznaafreen");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
	driver.findElement(By.name("password")).sendKeys("");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='gb_Ia gbii'and @aria-hidden='true']")));
	driver.findElement(By.xpath("//span[@class='gb_Ia gbii'and @aria-hidden='true']")).click();
	driver.findElement(By.id("gb_71")).click();
	
	
}
}
