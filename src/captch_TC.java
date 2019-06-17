import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captch_TC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		//driver.get("https://spinbot.com/Login/");

		/*
		 * int number = findFrameNumber(driver,
		 * By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		 * driver.switchTo().frame(number);
		 * driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		 * 
		 * 
		 * 
		 * int number1 = findFrameNumber(driver,
		 * By.xpath(".//*[@id='recaptcha-verify-button']"));
		 * driver.switchTo().frame(number1);
		 * driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();
		 * }
		 * 
		 * public static int findFrameNumber(WebDriver driver, By by) throws
		 * InterruptedException {
		 * 
		 * int frameCount = driver.findElements(By.tagName("iframe")).size(); int i; for
		 * (i = 0; i < frameCount; i++) { Thread.sleep(1000);
		 * driver.switchTo().frame(i); int count = driver.findElements(by).size(); if
		 * (count > 0) { driver.findElement(by).click(); break;
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * System.out.println("Continue Looping.."); }
		 * 
		 * }
		 * 
		 * driver.switchTo().defaultContent(); return i;
		 */

		driver.get("https://spinbot.com/Login");

		int frame = framecount(driver, By.className("recaptcha-checkbox-checkmark"));

		driver.switchTo().frame(frame);

		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();

	}

	public static int framecount(WebDriver driver, By by)

	{

		int i;

		int framecount = driver.findElements(By.tagName("iframe")).size();

		System.out.println(framecount);

		for (i = 0; i < framecount; i++)

		{

			driver.switchTo().frame(i);

			int itemcount = driver.findElements(by).size();

			if (itemcount > 0)

			{

				break;

			} else

			{

				System.out.println("Continue");

			}

			driver.switchTo().defaultContent();

		}

		driver.switchTo().defaultContent();

		return i;

	}
}
