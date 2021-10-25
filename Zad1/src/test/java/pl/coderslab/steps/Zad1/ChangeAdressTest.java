package pl.coderslab.steps.Zad1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", plugin = {"pretty", "html:out.html"}, tags="@Zad1")
public class ChangeAdressTest {
}
