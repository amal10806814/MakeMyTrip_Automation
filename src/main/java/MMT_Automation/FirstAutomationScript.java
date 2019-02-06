package MMT_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomationScript  {

  public static void main (String args[])
  {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://www.toolsqa.com");
  }

}
