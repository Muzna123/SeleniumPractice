package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropDown2Test {
	@Test
	public void dynamicDropDown2Test() {
		String expVal = "Ruby";
		Boolean flag=false;
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/91886/Desktop/Select.html");
		WebElement wb = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(wb);
		List<WebElement> list = sel.getOptions();
		for(WebElement wb1:list)
		{
			if(expVal.equals(wb1.getText())) {
				sel.selectByVisibleText(expVal);
			System.out.println("Option is available");
			flag=true;
			break;
			}
		}
		if(flag==false)
			System.out.println("Option not available");
		
	}

}
