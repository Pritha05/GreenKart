package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",   
    monochrome = true ,
    plugin = {"pretty"},
    publish = true
)

public class TestRunner extends AbstractTestNGCucumberTests {
    
    @Override
    @DataProvider()
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
