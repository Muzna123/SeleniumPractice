package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest {
@Test
public void dropDownTest() {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/91886/Desktop/Select.html");	
	WebElement wb=driver.findElement(By.name("sel"));
	Select sel=new Select(wb);
	if(sel.isMultiple()) {
		System.out.println("DropDown is multiselect");
		int count=sel.getOptions().size();
		System.out.println("No. of elements in dropdown: "+count);
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
		}
	}
	else 
		System.out.println("DropDown is not  multiselect");
		
	sel.deselectAll();
	
}
}
