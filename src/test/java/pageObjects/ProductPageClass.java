package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageClass {
	WebDriver driver;
	
	public ProductPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//a[@href='/products']")
	 WebElement productlink;
	
	@FindBy(xpath="(//div[@class='productinfo text-center'])[1]")
     WebElement MouseHover;
	
	
	@FindBy(xpath="(//a[@data-product-id='1'])[1]")
    WebElement ClickAddtocart;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
    WebElement ClickCountBtn;
	
    @FindBy(xpath="(//a[@data-product-id='2'])[1]")
    WebElement ClickAddtocartmentShirt;
  
    
    @FindBy(xpath="//*[text()='View Cart']")
    WebElement ClicknoViewCart;
    
    
	public void clickproductbtn() {
		productlink.click();
	}
	public void mouseHover() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000);");
		
		Actions act=new Actions(driver);
		act.moveToElement(MouseHover).perform();
    }
	public void clickAddToCart() {
		ClickAddtocart.click();
	}
	public void clickContinbtn() {
		ClickCountBtn.click();
	}
	public void addToCartMenTshirt() {
		ClickAddtocartmentShirt.click();
	}
	public void ClickOnViewCart() {
		ClicknoViewCart.click();
	}
}