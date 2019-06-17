import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.name("passenger")).click();
		Thread.sleep(2000L);
		int i =1;
		while(i<5) {
			driver.findElement(By.xpath("//button[@class='pax-plus btn btn-info']")).click();
			i++;
			
		}
		//Thread.sleep(2000L);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done']")).click();
	}

}
