package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/register");

		WebElement firstName = driver.findElement(By.id("FirstName"));
		WebElement lastName = driver.findElement(By.id("LastName"));

		Actions act = new Actions(driver);
		act.sendKeys(firstName, "john").perform();

		act.keyDown(Keys.CONTROL).keyDown("A").perform();
		act.keyUp(Keys.CONTROL).keyUp("A").perform();

		act.keyDown(Keys.CONTROL).keyDown("C").perform();
		act.keyUp(Keys.CONTROL).keyUp("C").perform();

		act.keyDown(Keys.TAB).perform();
//		act.keyUp(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();

		act.keyDown(Keys.CONTROL).keyDown("V").perform();
		act.keyUp(Keys.CONTROL).keyUp("V").perform();
	}

}
