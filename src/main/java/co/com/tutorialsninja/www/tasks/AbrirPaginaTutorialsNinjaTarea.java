package co.com.tutorialsninja.www.tasks;

import co.com.tutorialsninja.www.userinterfases.AbrirPaginaTutorialsNinja;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaTutorialsNinjaTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new AbrirPaginaTutorialsNinja()));
		
	}

	public static AbrirPaginaTutorialsNinjaTarea abrirpagina() {
		 return instrumented(AbrirPaginaTutorialsNinjaTarea.class);
	}

}
