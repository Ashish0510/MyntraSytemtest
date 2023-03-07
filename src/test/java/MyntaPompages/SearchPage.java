package MyntaPompages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@placeholder='Search for products, brands and more']")
	WebElement SearchElement;
	
	@FindBy (xpath="//h4[contains(text(),'Men JOT 4 PF ')]")
	WebElement SearchParticularElement;
	
	public void search(String product) throws InterruptedException  {
		 SearchElement.sendKeys(product +Keys.ENTER);
		 Thread.sleep(3000);
		 SearchParticularElement.click();
		 
		 
	}
	
	
	

}
