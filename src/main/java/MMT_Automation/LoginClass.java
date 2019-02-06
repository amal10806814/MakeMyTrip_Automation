package MMT_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {

  WebDriver driver;

  By openloginpage = By.xpath("//*[@id=\"ch_login_icon\"]/span[2]");
  By username = By.id("ch_login_email");
  By password = By.id("ch_login_password");
  By Login = By.id("ch_login_btn");

  public LoginClass(WebDriver driver1)
  {
    this.driver= driver1;
  }

  public void openloginpage()
  {
    driver.findElement(openloginpage).click();
  }

  public void typeusername()
  {
    driver.findElement(username).sendKeys("amal.chaudhary@gmail.com");
  }

  public void typepassword()
  {
  driver.findElement(password).sendKeys("amal1991");
  }

  public void clickloginbutton()
  {
  driver.findElement(Login).click();
  }
}
