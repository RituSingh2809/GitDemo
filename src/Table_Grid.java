import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Grid {

	public static void main(String[] args) {
		
		int sum = 0;
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20794/nz-vs-ban-1st-test-bangladesh-tour-of-new-zealand-2019");
		WebElement table = driver.findElement(By.xpath(".//*[@id='innings_1']/div[1]"));
		int rowCount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++) {

			String value =table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int intValue = Integer.parseInt(value);
			sum=sum+intValue;
		
		}
		System.out.println(sum);
		String Extras = driver.findElement(By.xpath("//div[contains(text(),'Extras')]/following-sibling::div")).getText();
		int extras = Integer.parseInt(Extras);
		int totalSum = sum+extras;
		System.out.println(totalSum);
		String actualTotal=driver.findElement(By.xpath("//div[contains(text(),'Total')]/following-sibling::div")).getText();
		int actualTotalValue = Integer.parseInt(actualTotal);
		
		if(actualTotalValue==totalSum) {
			System.out.println("Count Matches");
		}
		else {
			System.out.println("Count does not match");
		}
	}
	
}
