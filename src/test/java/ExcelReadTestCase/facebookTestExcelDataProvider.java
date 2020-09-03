package ExcelReadTestCase;

import TestUtil.getTestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class facebookTestExcelDataProvider {

    WebDriver driver ;

    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @DataProvider
    public Iterator<Object[]> getDatafromExcelClass()
    {
       ArrayList<Object[]> testData = getTestData.getTestDatafromExcel();
       return testData.iterator();
    }

    @Test(dataProvider = "getDatafromExcelClass")
    public void getExcelData(String firstname, String lastname, String email , String password)
    {

        // Enter Data
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastname);

        driver.findElement(By.name("reg_email__")).clear();
        driver.findElement(By.name("reg_email__")).sendKeys(email);

        driver.findElement(By.name("reg_passwd__")).clear();
        driver.findElement(By.name("reg_passwd__")).sendKeys(password);
    }

    @AfterMethod
    public void close()
    {
        driver.close();
    }
}
