import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).getText());
		
	
	
	
	}

}
