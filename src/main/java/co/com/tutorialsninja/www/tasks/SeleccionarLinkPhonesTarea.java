package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarDatosRegistro;
import co.com.tutorialsninja.www.userinterfases.SeleccionarLinkPhones;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarLinkPhonesTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarLinkPhones.SECCION_LINK_PHONES));
		
	}

	public static SeleccionarLinkPhonesTarea phones() {
		return instrumented(SeleccionarLinkPhonesTarea.class);
	}
	

}
