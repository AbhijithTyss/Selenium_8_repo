package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSingleSelect {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/reg/?next=%2FnopCommerce");
		WebElement monthDropdown = driver.findElement(By.id("month"));// <select> address

		Select monthSelect = new Select(monthDropdown);
		System.out.println(monthSelect.isMultiple());

//		monthSelect.selectByIndex(11);
//		monthSelect.selectByValue("5");
		monthSelect.selectByVisibleText("Aug");

		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("1947");
	}

}
