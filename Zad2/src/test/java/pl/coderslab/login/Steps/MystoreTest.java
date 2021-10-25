package pl.coderslab.login.Steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", plugin = {"pretty", "html:out.html"}, tags="@Test2")
public class MystoreTest {
}
