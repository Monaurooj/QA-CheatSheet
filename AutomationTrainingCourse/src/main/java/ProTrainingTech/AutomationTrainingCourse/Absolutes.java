package ProTrainingTech.AutomationTrainingCourse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monau\\eclipse-workspace\\AutomationTrainingCourse\\src\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		//WebElement searchto=driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/input"));
		//searchto.click();
		
		// Relative xPath syntax
		// it starts with the // tagname[@attribute name ='value of attribute']
		//tagname[text()='text']
		//*[text()='text']
		//*[contains(text(),'text/linkname')]
		
		WebElement passwordfield=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		passwordfield.sendKeys("test123");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
		
		
		
	}
	
	

}
