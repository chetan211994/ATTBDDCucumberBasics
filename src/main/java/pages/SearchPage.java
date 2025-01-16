package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

	@FindBy(xpath ="//*[@id='twotabsearchtextbox']")
	private WebElement searchfield;
	
	@FindBy(xpath ="//*[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy(xpath ="//*[contains(text(),'Redmi 13C (Starfrost White')]/parent::a")
	private WebElement redmi13cPhone;


	private WebDriver driver;
	private WebDriverWait wait;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);
	}
	
	public void enterProduct(String productname)
	{
		searchfield.sendKeys(productname);
		searchButton.click();
	}
	
	public boolean verifyProduct()
	{
		wait.until(ExpectedConditions.visibilityOf(redmi13cPhone));
		boolean isDisplaying =redmi13cPhone.isDisplayed();
		return isDisplaying;
	}
	
	
	




}
