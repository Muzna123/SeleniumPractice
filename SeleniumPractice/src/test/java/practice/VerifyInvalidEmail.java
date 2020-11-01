package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyInvalidEmail {
	@Test
	public void verifyInvalidEmail() {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		WebElement wb=driver.findElement(By.id("identifierId"));
		String BackEndValue=wb.getAttribute("aria-label");
		System.out.println("aria-label attribute value"+ BackEndValue);
		String expVal="Couldn't find your Google Account";
		wb.sendKeys("cah");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		String actVal=driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
		if(actVal.equals(expVal)) 
			System.out.println("Error msg displayed----PASS");
		else
			System.out.println("Error msg not displayed--FAIL");
		String actColor=wb.getCssValue("color");
		System.out.println(actColor);
		
	}

}
