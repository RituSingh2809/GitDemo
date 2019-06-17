import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/practice.php");
		
		WebElement table=driver.findElement(By.xpath("//table[@id='product']"));
		System.out.println("RowCount is="+table.findElements(By.tagName("tr")).size());
		System.out.println("CoulmnCount is="+table.findElements(By.tagName("th")).size());
		
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/following::td[1]")).getText());
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/following::td[2]")).getText());
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[2]/following::td[3]")).getText());
		
		
		
		
		
		
	}

}
