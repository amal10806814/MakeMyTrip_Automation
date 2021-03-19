package BaseClass;

import TestUtil.testUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class baseNew_one {

    public static WebDriver driver ;
    public static Properties prop ;

  public  baseNew_one() throws IOException {
    prop = new Properties();
    FileInputStream fis = new FileInputStream("D:\\PracticeAutomation\\src\\main\\java\\Resources\\config.properties");
    prop.load(fis);
    }

    public static void initialization()
    {
       String browserName = prop.getProperty("Browser");
       if (browserName.equals("Chrome"))
       {
           System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
       }
       else
       {
           System.out.println("error");
       }

       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(testUtil.pageTimeout , TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(testUtil.implicitWait, TimeUnit.SECONDS);

       driver.get(prop.getProperty("url"));
    }
}
