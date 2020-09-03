package Pages;

import TestNG.Screeshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class SaveScreenShot {
    WebDriver driver;

    public void failedOne(String getMethodName) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile , new File("\"D:\\PracticeAutomation\\src\\main\\java\\TestUtil\\Screenshot\\"+getMethodName+".jpg"));
    }
}
