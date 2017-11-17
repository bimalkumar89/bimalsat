package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Browserinvo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//selenium 3
		//java req 1.8
		//firefix less 47 --selenium 2.5 ,48 - more selenium 3.0
		//System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");//invoke firefox in local machine
		WebDriver driver=new FirefoxDriver();// object of FirefoxDriver class and assigning to webdriver interface
//System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();

/* driver.get("https://devqa.giftbig.com/woohoo/");
System.out.println(driver.getTitle());
//System.out.println(driver.getPageSource());
System.out.println(driver.getCurrentUrl());
driver.findElement(By.xpath(".//*[@id='maincontainer']/div/div/form/div[1]/div/input")).sendKeys("bimal.satpathy@qwikcilver.com");
driver.findElement(By.xpath(".//*[@id='maincontainer']/div/div/form/div[2]/div/input")).sendKeys("bimal123");
driver.findElement(By.id("login")).click();

driver.close();*/
		
		
// Handling static drop downlist:
		driver.get("http://spicejet.com");
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));// select class with webelement as parameter
		s.selectByValue("6");
		
// Handling Dynamic dropdown
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();          // //a[@value='DEL'])[2] apply index [2] as it is in second drop down
}
}
