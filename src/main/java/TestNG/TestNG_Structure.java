package TestNG;

import javafx.scene.layout.Priority;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Structure {

  @BeforeSuite
  public void beforesuite()
  {
    System.out.println("set the environment");
  }

  @BeforeTest
  public void beforetest()
  {
    System.out.println("before test execute");
  }

  @BeforeClass
  public void beforeclass()
  {
    System.out.println("before class");
  }

  @BeforeMethod
  public void beforemethod()
  {
    System.out.println("enter google");
  }

  @Test(priority=1,groups="Page URL" , expectedExceptions = ArithmeticException.class)  //,invocationCount = 10
  public void test()
  {
    int i = 9/0;
    //System.out.println("enter url");
  }

  @Test(priority=3,groups="Login Credentials")
  public void testone()
  {
    System.out.println("enter credential");
  }


  @Test(priority=2,groups="product selections page",dependsOnMethods = "test")
  public  void testtwo()
  {
    System.out.println("select mobile");
  }

    @Test(expectedExceptions = NumberFormatException.class)
    public void StringtoInteger()
    {
        String s = "100A";
        int a =Integer.parseInt(s);
    }

  @AfterMethod

  public void aftermethod()
  {
    System.out.println("click on log out");
  }

  @AfterClass

  public void afterclass()
  {
    System.out.println("close browser");
  }


  @AfterTest

  public void aftertest()
  {
    System.out.println("clear cookies");

  }

  @AfterSuite

  public void aftersuite()
  {
    System.out.println("exit from all");
  }
}
