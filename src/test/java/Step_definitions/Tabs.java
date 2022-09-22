package Step_definitions;

import Utilties.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.Tbaspages;

public class Tabs {
    @When("user go to {string} and {string}")
    public void user_go_to_and(String tab, String modual) {
        WebDriverWait wait=new WebDriverWait(Driver.get(),20);
        Tbaspages tabs=new Tbaspages();
        WebElement tabb=tabs.getTab(tab);
        WebElement modules=tabs.getModules(modual);
        wait.until(ExpectedConditions.visibilityOf(tabb));
        Actions actions=new Actions(Driver.get());
        wait.until(ExpectedConditions.visibilityOf(tabb));
        actions.moveToElement(tabb).perform();
        modules.click();
      //  tabs.getModules(modual).click();

    }

    @Then("the title should be equal to {string}")
    public void the_title_should_be_equal_to(String expectedTitle) throws InterruptedException {
        Thread.sleep(1000);
     String actualTitle=Driver.get().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
