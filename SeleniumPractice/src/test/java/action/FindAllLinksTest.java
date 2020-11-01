package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FindAllLinksTest {
	@Test
	public void findAllLinks() {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No. of links: "+links.size());
		for(int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
	}

}
