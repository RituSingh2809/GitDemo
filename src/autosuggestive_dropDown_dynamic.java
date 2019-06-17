import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive_dropDown_dynamic {
//enter BENG option 
	//verify Airport option is there in the list or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
	
		
		//**************NOTE***********************
		
		//AJAX Implementation-in output there won't we any text displayed bcoz this a hidden element and selenium can't identify this element so for this we'll need javascriptExecutor
	//investigate the properies of an element if it has any hidden text
		//javascipt DOM can extract hidden element.
	//JavascriptExecutor---to Identify an element--
				//click on inspect-then console and then write like this --document.getElementById("fromPlaceName") and hit enter--this should highlight the DOM element for which we are looking for
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT")){
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}
		}
		if(i>10) {
			System.out.println("Element not found");
		}
	
		else {
			System.out.println("Element  found");
		}	
	}

}
