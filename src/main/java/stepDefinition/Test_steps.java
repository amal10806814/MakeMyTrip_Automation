package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_steps {

WebDriver driver ;
  @Given("^launch the google hoempage$")
  public void launch_the_google_hoempage() throws Throwable {

    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
  }

  @Then("^enter some text$")
  public void enter_some_text() throws Throwable {

    System.out.println("enter some text");
  }

  @Then("^click on search$")
  public void click_on_search() throws Throwable {

    System.out.println("verify text");
  }

}
