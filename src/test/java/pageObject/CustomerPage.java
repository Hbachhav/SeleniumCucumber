package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    public WebDriver ldriver;
    public CustomerPage (WebDriver rdriver)
    {
        ldriver = rdriver;
        PageFactory.initElements(rdriver,this);

    }
    @FindBy (xpath = "//span[@class='ui-button-text' and text()='Continue']")
    @CacheLookup
    WebElement btnContinue;

    public void setBtnContinue(){
        try {
            btnContinue.click();
        }
        catch (NullPointerException e){
            System.out.println(e +"((((((((((()))))))))))))");
        }

    }

}
