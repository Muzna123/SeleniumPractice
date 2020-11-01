package windowOrPopupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUploadPopUp1 {
	@Test
	public void fileUploadPopUp1() throws AWTException {
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
		
		driver.findElement(By.xpath("//div[]text()='Compose'")).click();
		driver.findElement(By.id(":s3")).click();
		StringSelection str=new StringSelection("C:\\\\MuznaResume");
		Toolkit tool=Toolkit.getDefaultToolkit();
		Clipboard mouse=tool.getSystemClipboard();
		mouse.setContents(str, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
