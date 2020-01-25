package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.SeleccionarValorPagar;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarValorPagarTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarValorPagar.VALIDACION_CARRITO));
		
	}

	public static SeleccionarValorPagarTarea valor() {
		return instrumented(SeleccionarValorPagarTarea.class);
	}

	
	
}
