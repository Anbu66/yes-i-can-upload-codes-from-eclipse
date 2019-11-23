package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iCan {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Full Practise\\Selenium Syntax\\NseIndia\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.nseindia.com/");
		
		// List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		 
		
			//driver.switchTo().frame("LyrIntrumentSelector");
			WebElement ma = driver.findElement(By.xpath("//li[@class='last active']"));
			ma.click();
	
		
		
	}

}
