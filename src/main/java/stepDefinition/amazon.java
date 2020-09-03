package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

  WebDriver driver;

  @Given("^launch the amazon url$")
  public void launch_the_amazon_url() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
  }

  @Then("^enter credential$")
  public void enter_credential() throws Throwable {
    System.out.println("hello");
  }

  @Then("^verify the homepage$")
  public void verify_the_homepage() throws Throwable {

    System.out.println("verified");

  }

}
