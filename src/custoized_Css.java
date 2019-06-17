import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class custoized_Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("asd@gmail.com");
		driver.findElement(By.cssSelector("input#email")).sendKeys("asd@gmail.com"); //tagname#id
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
		//driver.findElement(By.cssSelector("#pass")).sendKeys("1234"); //#id
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("1234"); //tagname.classname
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		driver.close();
	}

}
