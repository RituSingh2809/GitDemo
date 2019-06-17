import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//using xpath
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("angel.ritu2809@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("olp123");
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//using CSS selector
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gamil.com");
	}

}
