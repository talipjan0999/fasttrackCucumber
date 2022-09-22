package pages;

import Utilties.Driver;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Tbaspages {
    public Tbaspages(){
        PageFactory.initElements(Driver.get(),this);
    }
  public WebElement getTab(String tabName) {
     return    Driver.get().findElement(By.xpath("//span[contains(text(),\""+tabName+ "\")]"));
  }

  public WebElement getModules(String modualName){
        return Driver.get().findElement(By.xpath("//span[text()=\""+modualName+"\"]"));
  }
}
