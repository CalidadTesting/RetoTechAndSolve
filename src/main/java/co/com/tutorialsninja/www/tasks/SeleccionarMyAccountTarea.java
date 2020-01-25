package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.SeleccionarMyAccount;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarMyAccountTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarMyAccount.SELECCION_ACCOUNT));
		
	}

	public static SeleccionarMyAccountTarea account() {
		return instrumented(SeleccionarMyAccountTarea.class);
	}

}
