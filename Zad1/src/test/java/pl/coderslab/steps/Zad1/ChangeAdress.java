package pl.coderslab.steps.Zad1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ChangeAdress {

    public static WebDriver driver;


    @Given("^User is logged in to mytore$")
    public void userIsloggedIn() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");


        WebElement signIn = driver.findElement(By.className("user-info"));
        signIn.click();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("yondwqrjrekwawfuil@sdvft.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Haslotest");
        WebElement loginButton = driver.findElement(By.id("submit-login"));
        loginButton.click();


    }

    @When("User goes to Add adress tab")
    public void userGoesToAddressTab() {

        List<WebElement> adresses = driver.findElements(By.id("addresses-link"));



        if(adresses.isEmpty())
        {
            WebElement firstAddress = driver.findElement(By.id("address-link"));
            firstAddress.click();
        }
        else
        {
            WebElement addressTab = driver.findElement(By.id("addresses-link"));
            addressTab.click();
            WebElement addAddress = driver.findElement(By.xpath("//span[.='Create new address']"));
            addAddress.click();
        }

//
    }

    @And("User alias is {string}")
    public void userAlias(String keyword) {
        WebElement addAlias = driver.findElement(By.name("alias"));
        addAlias.sendKeys(keyword);

    }

    @And("User adress is {string}")
    public void userAdress(String keyword) {
        WebElement addAddress = driver.findElement(By.name("address1"));
        addAddress.sendKeys(keyword);
    }

    @And("User city is {string}")
    public void userCity(String keyword) {
        WebElement addCity = driver.findElement(By.name("city"));
        addCity.sendKeys(keyword);
    }


    @And("User zipcode is {string}")
    public void userZipcode(String keyword) {
        WebElement addZipcode = driver.findElement(By.name("postcode"));
        addZipcode.sendKeys(keyword);

    }

    @And("User country is {string}")
    public void userCountry(String keyword) {

        Select drpCountry = new Select(driver.findElement(By.name("id_country")));
        drpCountry.selectByVisibleText("United Kingdom");

    }

    @And("User phone is {string}")
    public void userPhone(String keyword) {
        WebElement addPhone = driver.findElement(By.name("phone"));
        addPhone.sendKeys(keyword);

    }

    @Then("User click save button")
    public void saveButton() {
        WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveButton.click();
    }

    @And("User sees confirmation that changes are saved")
    public void addressAddConfirmation() {
        WebElement confirmation = driver.findElement(By.className("alert-success"));

    }
    @And("Close browser")
    public void tearDown()
    {
        driver.quit();
    }


}
