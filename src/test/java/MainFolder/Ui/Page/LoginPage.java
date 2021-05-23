package MainFolder.Ui.Page;

import MainFolder.Ui.BaseClass.BaseClass;
import MainFolder.Ui.Locators.LoginLocator;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

public class LoginPage extends LoginLocator {
    public WebDriver getDriver() {
        return Driver;
    }

    WebDriver Driver;

BaseClass page = new BaseClass();
public LoginPage(){
   Driver  = page.chooseBrowserType("Chrome");
   PageFactory.initElements(Driver,this);
   Driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

}


public void goToLoginPage(){


    Driver.get("https://twitter.com/login");

}
public void sendLoginInLoginPage(String agr){

    username_or_email.sendKeys(agr);


}
public void sendPasswordInPassField(String arg){
    password.sendKeys(arg);

}
public void clickOnLogButt(){
    login.click();
}

public void clickOnForgotPasswrd(){
    forgot_password.click();
}

public void clickOnRegisterInTwitter(){
    register_in_twitter.click();
    }

public String getCurrentURL(){
  return   page.getCurrentURL();
}

public Cookie addCookie() throws FileNotFoundException, UnsupportedEncodingException {
    return new Cookie("key","value","path");



      }

    }






