package Step_definitions;


import java.util.*;

import io.cucumber.java.en.Then;


import org.junit.*;
import org.openqa.selenium.WebElement;
import pages.NavigationPage;

public class NavigationstepDef {
    @Then("user should be see below options")
    public void user_should_be_see_below_options(List<String> menuOptions) throws InterruptedException {
        List<String> actualOptions = new ArrayList<>();
        Thread.sleep(3000);

        for (WebElement ops : new NavigationPage().menuOptions) {
            actualOptions.add(ops.getText());

        }
        Assert.assertEquals(menuOptions,actualOptions);
    }
}