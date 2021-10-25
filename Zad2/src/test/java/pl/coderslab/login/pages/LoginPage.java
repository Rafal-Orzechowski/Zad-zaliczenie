package pl.coderslab.login.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    @FindBy(xpath = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/a/span")
    private WebElement signIn;

    @FindBy(name = "email")
    private WebElement userEmail;

    @FindBy(name = "password")
    private WebElement userPassword;

    @FindBy(id = "submit-login")
    private  WebElement submitLogin;

    @FindBy(id = "category-3")
    private WebElement logo;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signIn() {
        signIn.click();
        }

        public void insertLogin(String login)
        {
            userEmail.sendKeys(login);
        }
        public void insertPassword(String password)
        {
            userPassword.sendKeys(password);
        }
        public void submit()
        {
            submitLogin.click();
        }
        public void logoClick()
        {
            logo.click();
        }

}




