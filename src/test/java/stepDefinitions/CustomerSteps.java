package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.CustomerPage;
import utilities.BaseClass;

import java.time.Duration;


public class CustomerSteps extends BaseClass {

    WebDriver driver;
    public CustomerPage cp;



    @When("click on continue button for new customer")
    public void click_on_continue_button_for_new_customer()  {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        try {

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='tdb2']")));

        }
        catch(Exception e) {
            e.printStackTrace();
        }


        driver.findElement(By.xpath("//a[@id='tdb2']")).click();
      //  cp = new CustomerPage(driver);
      //  cp.setBtnContinue();

    }

    @Then("user should be at create an account section")
    public void user_should_be_at_create_an_account_section() {
        boolean acc = driver.findElement(By.xpath("//a[ text()='Create an Account']")).isDisplayed();
        Assert.assertEquals(true, acc);
    }

    @When("user selects from dropdown {string}")
    public void user_selects_from_dropdown(String India) {
        Select drpcounty = new Select(driver.findElement(By.xpath("//*[@name='country']")));
        drpcounty.selectByVisibleText(India);

    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String fname, String lname) {

        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(fname);
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(lname);


    }

    @When("User selects gender as {string}")
    public void user_selects_gender_as(String string) {


        driver.findElement(By.xpath("//*[@value='f']")).click();

    }

    @When("User enters as {string} , {string}, {string}, {string} and {string}")
    public void user_enters_as_and(String street, String suburb, String pincode, String city, String state) {

        driver.findElement(By.xpath("//*[@name='street_address']")).sendKeys(street);
        driver.findElement(By.xpath("//*[@name='suburb']")).sendKeys(suburb);
        driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys(pincode);
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys(city);
        driver.findElement(By.xpath("//*[@name='state']")).sendKeys(state);


    }

    @When("click on continue button")
    public void click_on_continue_button() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='tdb4']")).click();


    }

    @Then("user should get confirmation message as {string}")
    public void user_should_get_confirmation_message_as(String msg1) {

        String msg = driver.findElement(By.xpath("//h1['Your Account Has Been Created!']")).getText();

        Assert.assertEquals(msg, msg1);
    }


    @When("User enters Birthdate as {string}")
    public void user_enters_birthdate_as(String date) {

        driver.findElement(By.xpath("//*[@id='dob']")).click();

        Select drpmonth = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
        drpmonth.selectByVisibleText("Nov");

        Select drpyear = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
        drpyear.selectByVisibleText("1991");


        driver.findElement(By.xpath("//*[text()='26']")).click();


        //   driver.findElement(By.xpath("//*[@id='dob']")).sendKeys(date);

    }

    @When("User enters Email as {string}")
    public void user_enters_email_as(String email) {


        driver.findElement(By.xpath("//*[@name='email_address']")).sendKeys(email);

    }


    @When("User enter contact as {string} and {string}")
    public void user_enter_contact_as_and(String tel, String fax) {

        driver.findElement(By.xpath("//*[@name='telephone']")).sendKeys(tel);
        driver.findElement(By.xpath("//*[@name='fax']")).sendKeys(fax);


    }

    @When("User Enter credential as {string} and {string}")
    public void user_enter_credential_as_and(String pass, String confPass) {
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@name='confirmation']")).sendKeys(confPass);
    }

}
