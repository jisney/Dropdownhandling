package Dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\automation\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		//created three objects for class select
		Select dpday= new Select(driver.findElement(By.id("day")));
		Select dpmonth=new Select(driver.findElement(By.id("month")));
		Select dpyear=new Select(driver.findElement(By.id("year")));
dpday.selectByValue("10");
dpmonth.selectByIndex(11);
dpyear.selectByVisibleText("1991");
driver.findElement(By.xpath("//label[@class='_58mt']")).click();
	}

}
