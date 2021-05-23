package MainFolder.Ui.Steps;

import MainFolder.Ui.Page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;


public class MySteppesLogin {

    WebDriver driver;
    Cookie ck = new Cookie("value", "d","x") ;

    public WebDriver returnDriver(){
        return driver; }
    public void open(){
        driver.get("https://twitter.com/home");
    }

    @After
    public void TearDawn(){

        driver = loginPage.getDriver();
        System.out.println(ck);
       // driver.close();

      //  driver.manage().addCookie(ck);


    }

    LoginPage loginPage =  new LoginPage();
    @Given("We go to the login page")
    public void weGoToTheLoginPage() {
        loginPage.goToLoginPage();

    }


    @When("We enter {string} in the login field")
    public void weEnterIlnnnInTheLoginField(String arg0) {
      loginPage.sendLoginInLoginPage(arg0);
        
    }

    @And("We enter {string} in the password field")
    public void weEnterTfgESKPTTInThePasswordField(String arg0) {
        loginPage.sendPasswordInPassField(arg0);
    }

    @And("We press log in button")
    public void wePressLogInButton() {
      loginPage.clickOnLogButt();
    }

    @Then("We got to the main page")
    public void weGotToTheMainPage() throws FileNotFoundException, UnsupportedEncodingException {
      ck =  loginPage.addCookie();
       Assert.assertSame(loginPage.getCurrentURL(),"https://twitter.com/home");



    }



    @And("We enter  in the password field")
    public void we_enter_in_the_password_field() {

    }


    @Then("We do not see the link")
    public void weDoNotSeeTheLink() {
        Assert.assertNotSame(loginPage.getCurrentURL(),"https://twitter.com/home");
        loginPage.getCurrentURL();
    }

    @When("We enter  in the login field")
    public void weEnterLoginInTheLoginField() {

    }

    @Given("We go to the  main Page")
    public void weGoToTheMainPage() {
        open();
       // WebDriver Driver =  returnDriver() ;
        //driver.get("https://twitter.com/home");
    }
}
