package co.com.tutorialsninja.www.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/co/com/tutorialsninja/www/features/compra_tutorialsninja.feature",
		glue = "co.com.tutorialsninja.www.stepdefinitions",
		snippets = SnippetType.CAMELCASE
		)


public class TutorialsNinjaRunner {

}
