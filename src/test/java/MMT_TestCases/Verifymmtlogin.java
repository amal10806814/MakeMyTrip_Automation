package MMT_TestCases;

import MMT_Automation.FlightSearch;
import MMT_Automation.LoginClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifymmtlogin {

  @Test
  public void verifyvalidlogin()
  {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.get("https://www.makemytrip.com/");

    LoginClass loginobj = new LoginClass(driver);
    FlightSearch flightobj = new FlightSearch(driver);

    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    loginobj.openloginpage();

    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    loginobj.typeusername();
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    loginobj.typepassword();
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    loginobj.clickloginbutton();


    //now going to select flight and search
    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    flightobj.Searchfrommethod();

    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    flightobj.SearchToMethod();

    driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);

    flightobj.ClicktoSearch();


     List<WebElement> li = driver.findElements(By.xpath("//div//p/span[@class='num ng-binding'][1]"));
    for (WebElement ala: li){
      System.out.println(ala.getText());
    }

    //ArrayList<Integer> alist = new ArrayList<Integer>();

    //alist.add(11611);
    //alist.add(11742);


    //driver.quit();

  }

}
