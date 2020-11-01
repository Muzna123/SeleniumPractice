package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MMTCouponCode {
	@Test
	public void mMTCouponCode() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		String x="//p[text()='Up to Rs 1,500 instant discount on Domestic Flight...']"
				+ "/ancestor::div[@class='makeFlex column itemCard soCardHeight pointer']"
				+ "/descendant::span[text(),'COUPON: HDFCDOM']";
		String x1="//p[text()='Up to Rs 1,500 instant discount on Domestic Flight...']"
				+ "/ancestor::div[@class='makeFlex column itemCard soCardHeight pointer']"
				+ "/descendant::a[text(),'Book Now']";
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(x)));
		
		
		String couponCode=driver.findElement(By.xpath(x)).getText();
		driver.findElement(By.xpath(x1)).click();
		System.out.println(couponCode);
	
		
	}

}
