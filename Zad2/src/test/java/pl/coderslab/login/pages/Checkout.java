package pl.coderslab.login.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Checkout {

    private static WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")
    private WebElement proceedToCheckout2;

    @FindBy(name = "confirm-addresses")
    private  WebElement adressConfirmation;

    @FindBy(id = "delivery_option_1")
    private  WebElement shippingMethod;

    @FindBy(id= "payment-option-1")
    private  WebElement paymentOption;

    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement termsAndConditions;

    @FindBy(name = "confirmDeliveryOption")
    private WebElement deliveryConfirm;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement orderCofnirm;

    @FindBy(name = "confirm-addresses")
    private WebElement addressConfirm;
    public void checkoutt()
    {
        proceedToCheckout.click();
    }
    public void checkouttv2()
    {
        proceedToCheckout2.click();
    }
    public void confirmAdress()
    {
//        adressConfirmation.click();
        addressConfirm.click();
    }
    public void confirmShipping()
    {
        deliveryConfirm.click();
    }

    public void paymentCofirmation()
    {
        paymentOption.click();

    }
    public void termsConfirmation()
    {
        termsAndConditions.click();
    }


    public void orderConfirmation()
    {
        orderCofnirm.click();
    }
    public void screenShoot()
    {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\projectScreenshots\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

