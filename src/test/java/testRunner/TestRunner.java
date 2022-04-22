package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//bachh//eclipse-workspace//SeleniumCucumber//Features//Login.features",
        glue = "stepDefinitions",
        dryRun = false,
      //  monochrome = true,
        plugin = {"pretty","html:test-output"}
        )
public class TestRunner {
        @BeforeClass
        public void befoe()
        {
                System.out.println("Before Suite Run successfully");
        }

        @Test(priority = 1)
        public void C()
        {
                System.out.println("Test Method 1");
        }

        @Test(priority = 1)
        public void B()
        {
                System.out.println("Test Method 2");
        }

}
