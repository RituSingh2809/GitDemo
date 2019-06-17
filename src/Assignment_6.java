import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/practice.php");
		//selecting checkbox
		WebElement chcBox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
		chcBox.click();
		System.out.println(chcBox.getAttribute("value"));
		
		//selecting dropdwon chckbox value
		Select s = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByValue(chcBox.getAttribute("value"));
		//displying in txtbox
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(chcBox.getAttribute("value"));
		//displaying alertBox
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		//System.out.println(alert.getText());
		//Verifying the success or failure of the text display

        String Expected = "Hello option2, share this practice page and share your knowledge";
        if( alertText.equalsIgnoreCase(Expected)) {
        	System.out.println("The text is Successful");
        }
        else {
        	System.out.println("The text is failed!");
        	Thread.sleep(5000);
        }
	
	}

}
