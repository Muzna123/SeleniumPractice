package practice;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void sampleTest() {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com");
		String currentPageTitle=driver.getTitle();
		System.out.println(currentPageTitle);
		if(currentPageTitle.equals("Sign in – Google accounts"))
		System.out.println("Login page availabe---PASS");
		else
		System.out.println("Login page not available---FAIL");
	    System.out.println(driver.getCurrentUrl());
	   String browserSessionID=driver.getWindowHandle();
	    System.out.println(browserSessionID);
	    String currentPageHTMLcode=driver.getPageSource();
	    System.out.println(currentPageHTMLcode);
	    driver.quit();
	}

}
