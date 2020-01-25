package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarUsuarioContraseña;
import co.com.tutorialsninja.www.userinterfases.SeleccionarIconoCorazon;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarIconoCorazonTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarIconoCorazon.ICONO_CORAZON));
		
	}

	public static SeleccionarIconoCorazonTarea corazon() {
		return instrumented(SeleccionarIconoCorazonTarea.class);
	}

}
