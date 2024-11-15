package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JavaConditionVerification {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		if (driver.getTitle().equals("Demo Web")) {
			Reporter.log("Welcome page is displayed",true);
		}else {
			Reporter.log("Welcome page is not displayed",true);
		}
		
		driver.findElement(By.linkText("Log in")).click();
		if (driver.getTitle().equals("Demo Web Shop. Login")) {
			Reporter.log("Login page is displayed",true);
		}else {
			Reporter.log("Login page is not displayed",true);
		}
		
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if (driver.getTitle().equals("Demo Web Shop")) {
			Reporter.log("Home page is displayed",true);
		}else {
			Reporter.log("Home page is not displayed",true);
		}
	}
}
