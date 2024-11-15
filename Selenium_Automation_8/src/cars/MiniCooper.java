package cars;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MiniCooper {
	@Test(groups = "smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.mini.in/en_IN/home/range/mini-cooper-3-door.html");
		Reporter.log("MiniCooper launched successfully",true);
	}
}
