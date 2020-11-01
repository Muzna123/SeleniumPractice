package windowOrPopupHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadPopUp {
	@Test
	public void fileUploadPopUp() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/account/createaccount");
		driver.findElement(By.name("userType")).click();
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\MuznaResume");
		
	}

}
