import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*WebDriver driver;
		System.setProperty("webDriver.chrome.driver","/Users/apple/Desktop/Selenium/chromedriver");
		driver = new ChromeDriver();*/
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.get("file:///Users/apple/Desktop/new/new.html");
		
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cup");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.amazon.in");
		
		driver2.findElement(By.id("twotabsearchtextbox")).sendKeys("cup");
		driver2.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		
		
		
		
	}

}
