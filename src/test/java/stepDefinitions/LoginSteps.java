package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.CustomerPage;
import pageObject.LoginPage;
import utilities.BaseClass;

public class LoginSteps extends BaseClass {


    WebDriver driver ;
    public LoginPage lp;
    public CustomerPage cp;


    @Given("User launch chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bachh\\eclipse-workspace\\SeleniumCucumber\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();




    }
    @When("User opens GCR shop site")
    public void user_opens_gcr_shop_site() {
    driver.get("https://gcreddy.com/project/");
    }
    @Then("User verify the title of page")
    public void user_verify_the_title_of_page() {

        boolean status = driver.findElement(By.xpath("//*[@title=\"GCR Shop\"]")).isDisplayed();
        Assert.assertEquals(true,status);

    }
    @Then("close browser")
    public void close_browser() {
    driver.quit();
    }

    @When("User click on Account button")
    public void user_click_on_account_button() {


        lp = new LoginPage(driver);

       lp.myaccount();

    }

    @When("User enter Email as {string} and Password as {string}")
    public void user_enter_email_as_and_password_as(String email, String password) {
        lp = new LoginPage(driver);
        lp.setUserName(email);
        lp.setPassword(password);
    }

    @When("User click on SignIn button")
    public void user_click_on_sign_in_button() {
        lp = new LoginPage(driver);
        lp.signIn();
    }
    @Then("Home page title should be {string}")
    public void Home_page_title_should_be(String title) {

        String title1 = driver.findElement(By.xpath("//h1['My Account Information']")).getText();

        Assert.assertEquals(title,title1);


    }

    @When("user click on logOff")
    public void user_click_on_log_off() {

        lp = new LoginPage(driver);
        lp.logOff();

    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {

        String title1 = driver.findElement(By.xpath("//h1['Log Off']")).getText();

        Assert.assertEquals(title,title1);

    }


}
