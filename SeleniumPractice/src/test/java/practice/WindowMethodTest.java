package practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowMethodTest {
	@Test
public void windowMethodTest() {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
    Dimension dem=new Dimension(100, 300);
	driver.manage().window().setSize(dem);
	driver.manage().window().maximize();
	Point p=new Point(400, 0);
	driver.manage().window().setPosition(p);
	driver.quit();
	
}
}
