package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.SeleccionarViewCart;
//import co.com.tutorialsninja.www.userinterfases.ViewValorPagar;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarViewCartTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarViewCart.BOTON_VIEW_CART));
		
	}

	public static SeleccionarViewCartTarea view() {
		return instrumented(SeleccionarViewCartTarea.class);
	}

}
