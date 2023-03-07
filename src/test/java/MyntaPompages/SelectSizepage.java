package MyntaPompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectSizepage {
	WebDriver driver;
public	SelectSizepage(WebDriver driver) {
	this.driver=driver;
	
}
By ele=By.xpath("(//div[@class='size-buttons-size-buttons']/div)[1]/div/button/p");
public void SelectSize() throws InterruptedException {
	//for (int i=1;i<=7;i++ ) {
		
		//String sizes = driver.findElement(By.xpath("(//div[@class='size-buttons-size-buttons-error size-buttons-size-buttons']/div)["+i+"]/div/button/p")).getText();
		//System.out.println(sizes);
		
	//}
	
	Thread.sleep(5000);
	driver.findElement(ele).click();
}

}
