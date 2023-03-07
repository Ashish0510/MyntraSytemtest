package MyntaTestCases;
import java.awt.AWTException;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import MyntaPompages.*;
import MyntaPompages.CheckBag;

public class Search_test extends BaseClassMyntra {
	

	@Test
	public void SearchProduct() throws InterruptedException, AWTException {
		SearchPage sp = new SearchPage(driver);
		sp.search("Men Jordan One Take 4");
		
		String Browseradd = driver.getWindowHandle();
		
		logger.info("this is in searchproduct page" + Browseradd);

		Set<String> Browseradds = driver.getWindowHandles();
		System.out.println("windowhandler" + Browseradd);
		for (String bro : Browseradds) {
			System.out.println("child access first" + bro);
			if (!Browseradd.equals(bro)) {
				driver.switchTo().window(bro);

				SelectSizepage ssp = new SelectSizepage(driver);
				ssp.SelectSize();

				AddToCart Ac = new AddToCart(driver);
				Ac.clickaddTocart();

				CheckBag cb = new CheckBag(driver);
				cb.checkBag();
				boolean check = cb.inBag();

				if (check) {
					Assert.assertTrue(true);
					logger.info("the product is found in the bag");

				}

				else {
					Assert.assertTrue(false);
					logger.info("the product is not found in the bag");
				}
				cb.clickGotIt();
				cb.PlaceOreder();
			}
		}

	}

	@Test(enabled=false)
	public void AddToCart() throws InterruptedException {

		

	}

}
