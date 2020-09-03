package MMT_TestCases;

import MMT_Automation.loginPage;
import BaseClass.baseNew_one;
import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class validateAmazon extends baseNew_one {
    loginPage obj;

    public validateAmazon() throws IOException {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
         obj = new loginPage();
    }

    @Test(priority = 1)
    public void loginFunction()
    {
        obj.validateLoginPage(prop.getProperty("usr"),
                prop.getProperty("pwd"));
    }

    @Test(priority = 2,groups = "title" , dependsOnMethods = "loginFunction")
    public void verifyTitle()
    {
        System.out.println(obj.validateTitle());
        String a = obj.validateTitle();
        Assert.assertEquals("Login",a );
    }

    @AfterMethod

    public void tearDown()
    {
        driver.quit();
    }


}
