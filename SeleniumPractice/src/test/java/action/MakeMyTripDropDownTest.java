package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MakeMyTripDropDownTest {
	@Test
	public void makeMyTripDropDown() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement FromCity=driver.findElement(By.xpath("//label[@for='fromCity']"));
		WebElement ToCity=driver.findElement(By.xpath("//label[@for='toCity']"));
		WebElement Departure=driver.findElement(By.xpath("//span[text()='DEPARTURE']"));
		WebElement MonthYear=driver.findElement(By.xpath("//div[text()='March 2020']"));
		Select sel1=new Select(FromCity);
		Select sel2=new Select(ToCity);
		Select sel3=new Select(Departure);
		//sel1.selectByVisibleText("Bangalore, India");
		//sel2.selectByVisibleText("Mumbai, India");
		sel3.selectByVisibleText("March 2020");
		
	}

}
