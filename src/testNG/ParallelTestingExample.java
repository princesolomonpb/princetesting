package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTestingExample {
	WebDriver driver;
	long starttime;

	@BeforeSuite
public void openbrowser() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\SeleniumLearning\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	@Test(priority = 1)
public void openchrome() {
driver.get("http://www.google.co.in");
	
}
	@Test(priority = 2)
public void openbing() {
		driver.get("http://www.bing.com");
}
	@Test(priority = 3)
public void openyahoo() {
		driver.get("http://www.yahoo.com");
}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		long endtime=System.currentTimeMillis();
		long totaltime=endtime-starttime;
		System.out.println("total time is taken"+totaltime);
		
	}
}
