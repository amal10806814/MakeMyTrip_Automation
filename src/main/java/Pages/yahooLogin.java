package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;


public class yahooLogin {

    WebDriver driver;

//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test Case Description : Verify login page title")
//    @Story("Story name: Login test page")
//
    @BeforeMethod
    public void start()
    {
        System.out.println("Before method");
    }

    @Test(priority = 1, expectedExceptions = NoSuchElementException.class)
    @Parameters({"browser" , "url", "emailid"})
    public void loginTest(String browser, String url , String emailid) {
        System.out.println("thread id_Yahoo:" + Thread.currentThread().getId());

        if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver" , "D:\\ChromeDriver\\GeekoDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else
        {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\new\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        String title = driver.getTitle();

        SoftAssert sa = new SoftAssert();
        sa.assertEquals("Yahoo - login", title);

        driver.findElement(By.name("username")).sendKeys(emailid);

        sa.assertEquals(false, false);
        sa.assertAll();

    }
        @Test(priority = 2 , enabled = true)
        public void secondTest()
        {
            //System.out.println("thread id:" + Thread.currentThread().getId());
            System.out.println("not enabled");
        }

        @AfterMethod
        public void tearDown()
        {
            driver.quit();
        }

    }

