package listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/reg");
//		WebElement yearDropdown = driver.findElement(By.id("year"));
//
//		Select yearSelect=new Select(yearDropdown);
//		List<WebElement> allOptions = yearSelect.getOptions();
//		yearSelect.selectByIndex(allOptions.size()-1);

		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropdown);

		List<WebElement> allOptions = monthSelect.getOptions();
		for (WebElement ele : allOptions) {
			monthSelect.selectByVisibleText(ele.getText());
		}
	}

}
