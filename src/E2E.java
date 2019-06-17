import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //using reg ex in CSS
		driver.findElement(By.id("login1")).sendKeys("Helllooo");
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		//driver.close();
		
	}

}
