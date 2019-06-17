import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslCertificatets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//accept insecure certificates
		//type 1
		ch.acceptInsecureCerts();
		//type 2
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	
		//belongs to your local browser
		ChromeOptions  c=new ChromeOptions();
		c.merge(ch);
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		
		
		
		
	}

}
