import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("angel@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("loveu123");
		driver.findElement(By.id("Login")).click();
		
		String error_text =  driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(error_text);
		driver.close();
	}

}
