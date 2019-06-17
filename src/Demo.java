import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set web browser property first.

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver",System.getProperty("user.dir") + "\\resources\\drivers\\MicrosoftWebDriver.exe");
		// create driver object
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); 
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.get("https://www.yahoo.com");
		//driver.navigate().back();
		//Thread.sleep(3000);
		//driver.navigate().forward();
		driver.navigate().to("https://www.google.com");
		
		//System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
