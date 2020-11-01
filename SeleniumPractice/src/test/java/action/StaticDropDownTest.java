package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaticDropDownTest {
	@Test
	public void staticDropDown() {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dwb=driver.findElement(By.id("day"));
		WebElement mwb=driver.findElement(By.id("month"));
		WebElement ywb=driver.findElement(By.id("year"));
		Select sel1=new Select(dwb);
		sel1.selectByVisibleText("13");
		Select sel2=new Select(mwb);
		sel2.selectByVisibleText("Jan");
		Select sel3=new Select(ywb);
		sel3.selectByVisibleText("1989");
	}

}
