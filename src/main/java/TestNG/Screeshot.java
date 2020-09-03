package TestNG;

import Pages.CustomListener;
import Pages.baseClass;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class Screeshot extends baseClass {

    @BeforeMethod
    public void setUp()
    {
        initialization();
    }

    @Test
    public void takeScreenshot1()
    {
        Assert.assertEquals(false,true);
    }

    @Test
    public void takeScreenshot2()
    {
        Assert.assertEquals(false,true);
    }

    @Test
    public void takeScreenshot3()
    {
        Assert.assertEquals(false,true);
    }
    @AfterMethod
    public void teardown()
    {
        driver.quit();
    }
}
