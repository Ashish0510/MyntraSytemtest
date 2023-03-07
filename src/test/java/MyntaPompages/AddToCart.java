package MyntaPompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	WebDriver driver;
	public AddToCart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (xpath="//div[text()='ADD TO BAG']")
	WebElement Addproduct;
	
	
	public void clickaddTocart() {
		Addproduct.click();
		
	}
}
