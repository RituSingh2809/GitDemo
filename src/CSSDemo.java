import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("asdsd@gmail.com"); //tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("123456");
		//driver.findElement(By.cssSelector("input[name='Login']")).click();
		driver.findElement(By.cssSelector("#Login")).click(); //#attributevalue
	}

}
