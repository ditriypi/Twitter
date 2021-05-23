package MainFolder.Ui.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
    @FindBy(xpath = "//*[contains(@name,'username_or_email')]")
  public   static WebElement username_or_email;

    @FindBy(xpath ="//input[@name='session[password]']")
  public   static WebElement password;

    @FindBy(xpath = "//div[contains(@class,'css-901oao r-1awozwy r-j')]")
  public   static WebElement login;

    @FindBy(xpath = "//*[contains(@href, 'https://twitter.com/account/begin_password_reset')] ")
  public   static WebElement forgot_password;

    @FindBy(xpath = "//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0']")
  public   static WebElement  register_in_twitter;

}
