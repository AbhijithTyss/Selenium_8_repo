package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		System.out.println("======before passing data======");
		System.out.println(loginButton.isEnabled());

		driver.findElement(By.name("username")).sendKeys("1234567890");
		driver.findElement(By.name("password")).sendKeys("test@1235");

		System.out.println("======after passing data======");
		System.out.println(loginButton.isEnabled());
	}

}
