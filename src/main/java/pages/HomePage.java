package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy(xpath ="//*[@id='nav-cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//*[@alt='Great Freedom Sale']")
	private WebElement saleSection;
	
	@FindBy(xpath = "//*[@alt='Amazon Business']")
	private WebElement business;

	private WebDriver driver;
	private WebDriverWait wait;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);
	}
	
	
	//To Find the title of page
	public String fetchTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	//To Verify Cart Icon
	public boolean verifyCartIcon()
	{
		boolean isDisplaying = cartIcon.isDisplayed();
		
		return isDisplaying;
	}
	
	//Click on Sport Section
	public void enteringSaleSection()
	{
		wait.until(ExpectedConditions.visibilityOf(saleSection));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", saleSection);
		
		
	}
	
	//To Identify Business Tab
	public boolean identifyBusinessTab()
	{
		wait.until(ExpectedConditions.visibilityOf(business));
		
		boolean isDisplaying = business.isDisplayed();
		
		return isDisplaying;
	}




	
	
}
