package ProTrainingTech.AutomationTrainingCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monau\\eclipse-workspace\\AutomationTrainingCourse\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		
		WebElement createanaccount=driver.findElement(By.linkText("Create new account"));
		
		createanaccount.click();
		Thread.sleep(6000);
		
		WebElement birthofmonth=driver.findElement(By.name("birthday_month"));
		Select ob = new Select(birthofmonth);
		ob.selectByIndex(6);
		
		

	}

}
