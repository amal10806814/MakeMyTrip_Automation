package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;


public class baseClass {
    public static WebDriver driver;


    public static void initialization()
    {
        System.setProperty("webdriver.chrome.driver" , "D:\\ChromeDriver\\new\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }


    public void failed(String getMethodName) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("D:\\PracticeAutomation\\src\\main\\java\\TestUtil\\Screenshot\\"+getMethodName+".jpg"));

    }

}
