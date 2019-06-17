import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(count);
		//handling radio buttons dynamically
		for(int i=0;i<count;i++) {
			//driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();
			//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
		String text =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		/*if(text =="Cheese") {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
		}*/
		if(text.equals("Cheese")){
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		}

		}
		
		
	}

}
