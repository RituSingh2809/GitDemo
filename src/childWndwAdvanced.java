import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWndwAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("After switching");
		
		driver.switchTo().window(parentId);
		//driver.manage().window().maximize();
		System.out.println("After switching back to parent");
		System.out.println(driver.getTitle());

	}

}
