package pages;

import Utilties.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.*;

public class login {
    public  login(){

        PageFactory.initElements(Driver.get(),this);
    }

     @FindBy(xpath = "//input[@type=\"text\"]")
     public WebElement username;


    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement password;

    @FindBy(css = ".btn.btn-primary")
    public  WebElement loginbutton;

    @FindBy(xpath = "//h2")
    public WebElement title;

    @FindBy(css = "#flash")
    public WebElement successmasage;

    }