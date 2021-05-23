package MainFolder.Ui.InitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class InitDriver {

    private WebDriver driver;

   private ChromeDriver  initChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        return new ChromeDriver();
    }

    private FirefoxDriver initFierfoxDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        return new FirefoxDriver();
    }

    public WebDriver SetDriver(String TypeBrowser){
        switch (TypeBrowser) {
            case ("Chrome") -> driver = initChromeDriver();
            case ("Fierfox") -> driver = initFierfoxDriver();

        }
        return driver;
    }

}
