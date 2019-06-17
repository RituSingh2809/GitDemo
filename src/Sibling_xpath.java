import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/");
		
		driver.findElement(By.linkText("Interview Guide")).click();
		driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();  //identifying child and sibling node
		//driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/parent::ul"));  //going back to parent from sibling
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();  ///text based element identification
	}

}
