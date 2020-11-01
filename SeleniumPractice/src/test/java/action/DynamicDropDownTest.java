package action;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DynamicDropDownTest {
	@Test
	public void dynamicDropDown() {
		//SoftAssert s = new SoftAssert();
		Boolean flag = false;
		String expVal = "Ruby";
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/91886/Desktop/Select.html");
		WebElement wb = driver.findElement(By.xpath("//select[@multiple='true']"));
		Select sel = new Select(wb);
		List<WebElement> list = sel.getOptions();
		for (int i = 0; i < list.size(); i++) {
			String actVal = list.get(i).getText();
			// s.assertEquals(actVal,expVal);
			if (actVal.equals(expVal)) {
				sel.selectByIndex(i);
				flag = true;
				break;
			}
		
		}
		if (flag == true)
			System.out.println("expVal is available--PASS");
		else
			System.out.println("expVal not available--Fail");

		// s.assertAll();

	}

}
