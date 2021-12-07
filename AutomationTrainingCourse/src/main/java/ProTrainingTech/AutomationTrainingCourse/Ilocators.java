package ProTrainingTech.AutomationTrainingCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {

	public static void main(String[] args) {
		WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\monau\\eclipse-workspace\\AutomationTrainingCourse\\src\\Drivers\\chromedriver.exe");
driver= new ChromeDriver();
driver.navigate().to("http://Amazon.com");
driver.manage().window().maximize();
WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
searchbutton.click();
WebElement bestsellers= driver.findElement(By.linkText("Best Sellers"));
bestsellers.click();
WebElement Cyber= driver.findElement(By.partialLinkText("Cyber"));
Cyber.click();




}
}