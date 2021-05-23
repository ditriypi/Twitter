package MainFolder.Ui.BaseClass;

import MainFolder.Ui.InitDriver.InitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;

import java.sql.Driver;

public class BaseClass extends InitDriver {
    WebDriver Driver ;

  public WebDriver chooseBrowserType(String type){
      Driver = SetDriver(type);
      return Driver;
  }

   public void openSite(String url){
       Driver.get(url);
   }

   public String getCurrentURL(){return Driver.getCurrentUrl();}


}
