package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPage {
	// declaration
	@FindBy(id = "navbar-search-input")
	private WebElement searchTF;
	
	public SkillRaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTF() {
		return searchTF;
	}
	
}