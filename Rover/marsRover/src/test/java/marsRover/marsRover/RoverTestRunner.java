package marsRover.marsRover;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.core.cli.Main;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/marsrover/feature",
    glue = "marsRover/marsRover/steps"
)
public class RoverTestRunner {
	public static void main(String[] args) {

    }
}
