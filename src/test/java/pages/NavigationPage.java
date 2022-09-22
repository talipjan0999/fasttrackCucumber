package pages;

import Utilties.Driver;
import java.util.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    public  NavigationPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".title.title-level-1")
    public List<WebElement> menuOptions;
}
