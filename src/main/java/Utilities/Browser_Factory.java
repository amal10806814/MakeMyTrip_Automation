package Utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser_Factory {

  static WebDriver driver ;

//  WebDriverWait wait;

  public static WebDriver startbrowser( WebDriver driver, String browsername , String url) throws InterruptedException {
    if (browsername.equals("firefox")) {
      driver = new FirefoxDriver();
    } else if (browsername.equals("Chrome")) {
      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
      driver = new ChromeDriver();

    } else if (browsername.equals("IE")) {
      driver = new InternetExplorerDriver();
    }

    driver.manage().window().maximize();

    driver.get(url);

    //WebDriverWait wait = new WebDriverWait(driver,10);

    //WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("ch_login_icon")));

   // Thread.sleep(1000);

   // driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

    return driver;
  }

  public static void ExitBrowser(WebDriver driver)
  {
    driver.quit();
  }
}
