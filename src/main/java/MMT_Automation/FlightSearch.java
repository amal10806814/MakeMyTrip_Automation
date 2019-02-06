package MMT_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearch {

  public FlightSearch(WebDriver driver1)
  {
    this.driver = driver1;
  }

  WebDriver driver ;

  By Searchfrom = By.xpath("//div//input[@id='hp-widget__sfrom']");
  By SearchTo = By.xpath("//div//input[@id='hp-widget__sTo']");
  By Clicksearch = By.xpath("//div//button[@id='searchBtn']");

  public void Searchfrommethod()
  {
    driver.findElement(Searchfrom).click();
  }

  public void SearchToMethod()
  {
    driver.findElement(SearchTo).sendKeys("Mumbai");
  }

  public void ClicktoSearch()
  {
    driver.findElement(Clicksearch).click();
  }
}
