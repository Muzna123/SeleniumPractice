package practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MmtFlightBooking {
	@Test
	public void mmtFlightBooking() {
		
		Date dateObj=new Date();
		String currentDate = dateObj.toString();
		System.out.println(currentDate);
		String currDate = currentDate.toString();
		String[] arr = currDate.split(" ");
		String date=arr[2];
		 String[] dateArr = date.split("");
		if(dateArr[0].equals("0"))
			date=dateArr[1];
			
		String year=arr[5];
		String month=dateObj.getMonth()+"";
		System.out.println(month);
		System.out.println(year);
		System.out.println(date);
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		driver.findElement(By.id("ToTag")).sendKeys("Goa, IN - Dabolim Airport (GOI)");
		driver.findElement(By.xpath("//a[@class='calendarIcon']/i[@class='icon ir datePicker']")).click();
		String x="//td[@data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+date+"']";
		//String x="//td[@data-month='month'and@data-year='year']/a[text()='date']";
		//String x="//td[@data-month='2' and @data-year='2020']/a[text()='6']";
		driver.findElement(By.xpath(x)).click();
		WebElement selectDropDown = driver.findElement(By.id("Adults"));
		Select sel=new Select(selectDropDown);
		sel.selectByValue("5");
		WebElement childrenDropdown=driver.findElement(By.id("Childrens"));
		childrenDropdown.click();
		Select sel1=new Select(childrenDropdown);
		sel1.selectByVisibleText("3");
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
