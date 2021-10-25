package pl.coderslab.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ClothPage {

    private static WebDriver driver;

    public ClothPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/article[2]/div/div[1]/h2/a")
    private WebElement hummingbirdTshirt;

    @FindBy(className = "discount discount-percentage")
    private WebElement discount;

    @FindBy(name = "qty")
    private  WebElement qty;

    @FindBy(className = "add-to-cart")
    private WebElement addToCart;



    public void selectItem()
    {
        hummingbirdTshirt.click();
    }
    public void checkDiscount()
    {
        discount.getText();
    }
    public void selectQty(String keyword)
    {
        qty.click();
        qty.clear();
        qty.sendKeys(keyword);
    }
    public void addToCart()
    {


        try {
            addToCart.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement addToCart = driver.findElement(By.className("add-to-cart"));
            addToCart.click();
        }


    }




}
