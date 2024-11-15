package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnIframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");
//		driver.switchTo().frame(0);    //index
//		driver.switchTo().frame("send-sms-iframe");   // name or id of <iframe> tag
		WebElement iframeExample = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));// xpath of
																										// <iframe> tag
		driver.switchTo().frame(iframeExample);
		driver.findElement(By.id("regEmail")).sendKeys("1234567");

//		driver.switchTo().defaultContent();//   to switch back driver control main page
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();
	}
}
