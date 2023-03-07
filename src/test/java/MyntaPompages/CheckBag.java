package MyntaPompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBag {
	WebDriver driver;
	String urll="Men Jordan One Take 4 PF";
	public CheckBag(WebDriver driver) {
		this.driver=driver;
	}

	By CheckProduct=By.xpath("//span[contains(text(),'Bag')]");

	By InBagCheck =By.xpath("//a[contains(text(),'"+urll+"')]");

	By placeorder=By.xpath("//div[contains(text(),'PLACE ORDER')]");

	By GotIt= By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']");

	public void checkBag() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(CheckProduct).click();
	}

	public boolean inBag() {
		if(driver.findElement(InBagCheck)!=null) {
			return true;
		}
		else {
			return false;
		}
		}

	public void PlaceOreder() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(placeorder).click();
	}

	public void clickGotIt() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(GotIt).click();
	}
}
