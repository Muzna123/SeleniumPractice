package practice;

import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RedBusBooking {
@Test
public void redBusBooking() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("Bengaluru");
	driver.findElement(By.id("dest")).sendKeys("Goa (All Locations)");
	driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
	
	LocalDate date=LocalDate.now();
	LocalDate OnwardDate = date.plusDays(50);
	System.out.println(OnwardDate);
	LocalDate returnDate=OnwardDate.plusDays(15);
	System.out.println(returnDate);
	int dayOfMonth = OnwardDate.getDayOfMonth();
    String month = OnwardDate.getMonth().toString();
    int year = OnwardDate.getYear();
    
			
	
}
}
