package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropDown1Test {
	@Test
public void dynamicDropDown() {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/91886/Desktop/Select.html");
		WebElement wb = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(wb);
		List<WebElement> list = sel.getOptions();
		for (int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i).getText());
}
}
