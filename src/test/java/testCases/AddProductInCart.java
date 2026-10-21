package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.ProductPageClass;

public class AddProductInCart extends Baseclass {
@Test
public void Addproduct_to_cart() {
	HomePage hp=new HomePage(driver);
	boolean messagehomepage= hp.homepagedisplay();
	Assert.assertEquals(messagehomepage, true);
	
	ProductPageClass prodpage=new ProductPageClass(driver);
	prodpage.clickproductbtn();
	//prodpage.mouseHover();
	prodpage.clickAddToCart();
	prodpage.clickContinbtn();
	prodpage.addToCartMenTshirt();
	prodpage.ClickOnViewCart();
	//div[@id='cart_info']
	List<WebElement> productlist=driver.findElements(By.xpath("//table[@id='cart_info_table'] //tr[starts-with(@id,'product-')]"));
	Assert.assertEquals(productlist.size(), 2);
	
	
	
}
}
