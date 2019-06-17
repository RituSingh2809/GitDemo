import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		// driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		
		/*  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.
		 linkText("Click to load get data via Ajax!"))));
		 driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		 String s = driver.findElement(By.xpath("//div[@id='results']")).getText();
		  System.out.println(s);
		 */

		WebElement link = driver.findElement(By.xpath("//a[contains(@href,'loadAjax')]"));
		link.click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement results = driver.findElement(By.xpath("//div[@id='results']"));
		wait.until(ExpectedConditions.visibilityOf(results));

		System.out.println(results.getText());

	}

}
