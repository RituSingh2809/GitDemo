import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverWait d = new WebDriverWait(driver,20); //Expilict wait

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit wait
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		driver.findElement(By.id("autoComplete__home")).sendKeys("Mum");
		//d.until(ExpectedConditions.elementToBeSelected(By.id("autoComplete__home")));
		//Thread.sleep(3000);
		driver.findElement(By.id("autoComplete__home")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("autoComplete__home")).sendKeys(Keys.ENTER);
		//d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/button[contains(text(),'Search OYO')]")));//explicit wait
		driver.findElement(By.xpath("//div/button[contains(text(),'Search OYO')]")).click();
		
		///d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Capital O 33476 Lavender Bough')]")));
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Capital O 33476 Lavender Bough')]")).click();
		
	}

}
