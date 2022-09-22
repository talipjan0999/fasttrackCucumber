package Step_definitions;

import Utilties.ConfigurationReader;
import Utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.login;

public class logintest {

    login login=new login();
    @Given("user go to the login page")
    public void user_go_to_the_login_page() {

        Driver.get().get(ConfigurationReader.get("login_url"));
    }

    @When("user enter  correct credentials")
    public void user_enter_correct_credentials() {
       String username=ConfigurationReader.get("username");
       String password=ConfigurationReader.get("password");

        login.username.sendKeys(username);
        login.password.sendKeys(password);


    }

    @When("user click the login button")
    public void user_click_the_login_button() {

        login.loginbutton.click();
    }

    @Then("users should be in {string}")
    public void users_should_be_in(String string) {
        String expectingmassage="Login Page";
        String actuallmsg=login.title.getText();
        Assert.assertEquals(expectingmassage,actuallmsg);
    }

    @Then("user should be see success massage")
    public void user_should_be_see_scuccess_massage() {
        System.out.println(login.successmasage.getText());
    }



}
