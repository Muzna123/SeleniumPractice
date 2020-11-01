package findElementsPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Top5BBCLinks {
	@Test
public void top5BBCLinks() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bbc.com/");
		String x="//div[@id='page']/section[3]/descendant::li/div/a";
		List<WebElement> list = driver.findElements(By.xpath(x));
		for(WebElement wb:list) {
			System.out.println(wb.getText());
		}
}
}
