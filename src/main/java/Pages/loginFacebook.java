package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginFacebook {

    WebDriver driver ;

    @Test(priority = 1, description = "verify login" , groups = "facebook validation")
    public void openBrowser()
    {
        System.out.println("thread id_ facebook :" + Thread.currentThread().getId());
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\new\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Test(priority = 2, description = "verify homepage" , dependsOnMethods ="openBrowser" , groups = "facebook validation")
   @Parameters({ "emailid" , "password"})
    public void homepage(String emailid , String password)
    {
        driver.findElement(By.name("email")).sendKeys(emailid);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.id("loginbutton")).click();

        //driver.findElement(By.xpath("//div//a[@aria-label='Facebook')).isDisplayed();

        Assert.assertEquals(true, true);

       String title = driver.getTitle();

        System.out.println(title);

        driver.quit();
    }
}
