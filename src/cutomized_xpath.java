import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cutomized_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bc123@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("assf123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	
	}

}
