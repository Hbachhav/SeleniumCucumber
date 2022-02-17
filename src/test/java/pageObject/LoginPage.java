package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver ldriver;
    public LoginPage (WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);

    }

    @FindBy(xpath = "//*[@name='email_address']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//*[@name='password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//button[@id='tdb1']")
    @CacheLookup
    WebElement btnSignIn;

    @FindBy(xpath = "//a[@id='tdb4']")
    @CacheLookup
    WebElement btnLogOff;

    @FindBy(xpath = "//a[@id='tdb3']")
    @CacheLookup
    WebElement btnAccount;


    public void setUserName(String user){
        txtEmail.clear();
        txtEmail.sendKeys(user);
    }
    public void setPassword(String password){
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void signIn(){
        btnSignIn.click();
    }
    public void logOff(){
        btnLogOff.click();
    }

    public void myaccount(){

        btnAccount.click();
    }

}
