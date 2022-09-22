package pages;

import Utilties.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public  VytrackLoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(css = "#prependedInput2")
    public  WebElement password;

    @FindBy(css = ".btn.btn-uppercase.btn-primary.pull-right")
    public  WebElement LoginButtom;

    public  void  logIn(String username, String password1){
       userName.sendKeys(username);
       password.sendKeys(password1);
       LoginButtom.click();

    }
}
