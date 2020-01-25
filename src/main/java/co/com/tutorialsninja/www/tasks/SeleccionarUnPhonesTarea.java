package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.SeleccionarMyAccount;
import co.com.tutorialsninja.www.userinterfases.SeleccionarUnPhones;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarUnPhonesTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarUnPhones.SELECCION_IPHONE));
		
	}

	public static SeleccionarUnPhonesTarea pda() {
		return instrumented(SeleccionarUnPhonesTarea.class);
	}

}
