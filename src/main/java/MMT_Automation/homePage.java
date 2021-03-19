package MMT_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class homePage  {
    static WebDriverWait wait ;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justanswer.com/sip/car");
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver,60) ;
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'Welcome')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("hi");

        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'help')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("car");
        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'make')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("swift");

        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'year')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("2017");
        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'fixing')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("no");
        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'Anything')]")));

        driver.findElement(By.xpath("//textarea[@class='text-area']")).sendKeys("no");

        driver.findElement(By.xpath("//input[@class='dqt-send send-btn disabled']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text' and contains(text(),'OK.')]")));

        driver.findElement(By.xpath("//a[@class='dqt-continue continue-link']")).click();
    }
}

