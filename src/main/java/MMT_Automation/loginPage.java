package MMT_Automation;

import BaseClass.baseNew_one;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class loginPage extends baseNew_one {

    // page factory = OR ;
    @FindBy(name="email")
    WebElement username ;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath= "//*[@id=\"mountRoot\"]/div/div/div/form/fieldset[2]/button")
    WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/div[1]/a")
    WebElement Title;

    //Initialize elements using page factory

    public loginPage() throws IOException {
       // super();
        PageFactory.initElements(driver, this);
    }

    //Actions
    public String validateTitle()
    {
        return driver.getTitle();
    }

    public void validateLoginPage(String usr, String pwd) {
        username.sendKeys(usr);
        submitButton.click();
        password.sendKeys(pwd);
        submitButton.click();
    }
}
