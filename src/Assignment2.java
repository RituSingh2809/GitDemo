import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.cssSelector("#OneWay")).click();
		if(driver.findElement(By.cssSelector("#OneWay")).isEnabled()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(false);
		}
		
		WebElement from = driver.findElement(By.xpath("//input[@id='FromTag']"));
			from.sendKeys("New");
			Thread.sleep(3000);
			//from.sendKeys(Keys.ARROW_DOWN);
			from.sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
			WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
			to.sendKeys("Jai");
			Thread.sleep(4000);
			//to.sendKeys(Keys.ARROW_DOWN);
			to.sendKeys(Keys.ENTER);
			//Thread.sleep(2000);
			driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
			
			Select s  = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
			s.selectByVisibleText("3");
			
			Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"Childrens\"]")));
			s1.selectByIndex(2);
			driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
			Thread.sleep(2000);
			Select s2 = new Select(driver.findElement(By.xpath("//select[@id='Class']")));
			s2.selectByIndex(1);
			driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("Indigo");
			
			driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
			driver.close();
	}

}
