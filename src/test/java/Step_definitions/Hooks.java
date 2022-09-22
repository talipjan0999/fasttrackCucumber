package Step_definitions;

import Utilties.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public  void setUp(){
        System.out.println("This is where tests are starting");
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("this is where tests are finished");
        Driver.closeDriver();
    }

    @Before("@wip")
    public  void wip(){
        System.out.println("this is vip test");
    }
}
