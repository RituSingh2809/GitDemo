import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
	
		// WebElement source = driver.findElement(By.xpath("//input[@id='fromCity']"));
		// element.clear();
		// source.sendKeys("MUM");
		// Thread.sleep(3000);
		// source.sendKeys(Keys.ARROW_DOWN);
	
		// Thread.sleep(3000);
		// source.sendKeys(Keys.ENTER);
		// source.click();

		//WebElement destination = driver.findElement(By.xpath("//input[@id='toCity']"));
		// destination.clear();
		// destination.sendKeys("DEL");
		// Thread.sleep(3000);
		// destination.sendKeys(Keys.ARROW_DOWN);
		// destination.sendKeys(Keys.ARROW_DOWN);
		// destination.sendKeys(Keys.ENTER);
	

		WebElement source = driver.findElement(By.xpath("//input[@id='fromCity']"));
		Thread.sleep(1000);
		source.click();
		Thread.sleep(1000);
		source.sendKeys("MUM");
		Thread.sleep(1000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		WebElement destination = driver.findElement(By.xpath("//input[@id='toCity']"));
		Thread.sleep(1000);
		destination.click();
		Thread.sleep(1000);
		destination.sendKeys("DEL");
		Thread.sleep(1000);
		for (int i = 1; i < 6; i++){
			destination.sendKeys(Keys.ARROW_DOWN);
		}
		destination.sendKeys(Keys.ENTER);

	}

}
