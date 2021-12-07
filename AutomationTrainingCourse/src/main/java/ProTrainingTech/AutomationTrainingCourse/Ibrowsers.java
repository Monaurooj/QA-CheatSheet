package ProTrainingTech.AutomationTrainingCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibrowsers {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monau\\eclipse-workspace\\AutomationTrainingCourse\\src\\Drivers\\chromedriver.exe");
driver= new ChromeDriver();
driver.navigate().to("http://Amazon.com");// open the site 
//Thread.sleep(6000);
driver.navigate().refresh(); // refresh the page 
//Thread.sleep(6000);
driver.navigate().back(); //go backward
//Thread.sleep(6000);
driver.navigate().forward();
//Thread.sleep(6000);
driver.manage().window().maximize();
String WindowHandle=driver.getWindowHandle();
System.out.println(WindowHandle);
String currentURL =driver.getCurrentUrl();
System.out.println(currentURL);
driver.close();


	}

}
