package Step_definitions;

import Utilties.ConfigurationReader;
import Utilties.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.VytrackLoginPage;

public class Vytrack_login {

    @Given("user at login page")
    public void user_at_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("user provide {string}  information")
    public void user_provide_information(String string) {
   String username=null;
   String password=null;
   if (string.equals("driver")){
       username=ConfigurationReader.get("driver_username");
       password=ConfigurationReader.get("driver_password");
   }else  if(string.equals("sales manager")) {
       username=ConfigurationReader.get("sales_manager_username");
       password=ConfigurationReader.get("Sales_manager_password");

   }else if(string.equals("store manager")){
       username=ConfigurationReader.get("store_manager_username");
       password=ConfigurationReader.get("store_manager_password");
   }
   new VytrackLoginPage().logIn(username,password);
    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() throws InterruptedException {
      Thread.sleep(2000);
      String actualtitile=Driver.get().getTitle();
        Assert.assertEquals("Dashboard",actualtitile);
    }

}
