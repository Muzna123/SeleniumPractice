package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GoogleSuggestionListData {
	@Test
public void googleSuggestionListData() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sachin");
		String x="//form[@id='tsf']/descendant::ul/li";
		List<WebElement> list = driver.findElements(By.xpath(x));
		for(WebElement wb:list) {
			System.out.println(wb.getText());
		}
		
}
}
