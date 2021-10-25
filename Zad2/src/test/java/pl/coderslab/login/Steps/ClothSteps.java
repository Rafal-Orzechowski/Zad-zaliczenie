package pl.coderslab.login.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pl.coderslab.login.pages.Checkout;
import pl.coderslab.login.pages.ClothPage;
import pl.coderslab.login.pages.LoginPage;

import java.util.concurrent.TimeUnit;



public class ClothSteps {
    LoginPage loginPage;
    WebDriver driver;

    @Given("an open browser with Mystore page")
    public void userOnMyStorePage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

    }

    @When("Sign in button is clicked")
    public void SignInButtonClick() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.signIn();
    }

    @And("^login is (.*)$")
    public void loginInsert(String keyword) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.insertLogin(keyword);
    }

    @And("^Password is (.*)$")
    public void passwordInsert(String keyword) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.insertPassword(keyword);
    }

    @And("Submit button is clicked")
    public void submitcredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.submit();
    }

    @And("User click main page button")
    public void toMainPage() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logoClick();


    }

    @And("User select Hummingbird Printed Sweater in shop")
    public void selectItem() {
   ClothPage clothPage = new ClothPage(driver);
   clothPage.selectItem();

    }

    @And("^User select (.*) size$")
    public void selectSize(String keyword) {
        WebElement size = driver.findElement(By.id("group_1"));
        Select select = new Select(size);
        select.selectByVisibleText(keyword);

    }

    @And("^User select (.*) pices$")
    public void selectQty(String keyword) {
        ClothPage clothPage = new ClothPage(driver);
        clothPage.selectQty(keyword);
    }

    @And("Add items into the basket")
    public void addItemsToBasket() {
        ClothPage clothPage = new ClothPage(driver);
        clothPage.addToCart();



    }

    @And("User proceeds to checkout")
    public void proceedToCheckout() {
        Checkout checkout = new Checkout(driver);
        checkout.checkoutt();
        checkout.checkouttv2();
    }

    @And("Users confirms address")
    public void confirmAddress() {
        Checkout checkout = new Checkout(driver);
        checkout.confirmAdress();

    }

    @And("User confirms shipping method")
    public void confirmShippingmethod() {
        Checkout checkout = new Checkout(driver);
        checkout.confirmShipping();
    }

    @And("User confirms payment")
    public void confirmPayment() {
        Checkout checkout = new Checkout(driver);
        checkout.paymentCofirmation();
    }

    @And("User agree to terms of service")
    public void termsConfirmation() {
        Checkout checkout = new Checkout(driver);
        checkout.termsConfirmation();
    }

    @And("User confirms order")
    public void orderConfirmation() {
        Checkout checkout = new Checkout(driver);
        checkout.orderConfirmation();
    }

    @Then("Screenshoot is taken.")
    public void screenShoot() {
        Checkout checkout = new Checkout(driver);
        checkout.screenShoot();
    }


}
