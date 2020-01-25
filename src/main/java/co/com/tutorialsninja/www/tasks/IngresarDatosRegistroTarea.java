package co.com.tutorialsninja.www.tasks;


import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.IngresarDatosRegistro;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatosRegistroTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue("Carlos Andres").into(IngresarDatosRegistro.FIRST_NAME));
		actor.attemptsTo(Enter.theValue("Perez Alzate").into(IngresarDatosRegistro.LAST_NAME));
		actor.attemptsTo(Enter.theValue("pe@pepe10.com").into(IngresarDatosRegistro.EMAIL));
		actor.attemptsTo(Enter.theValue("2343456").into(IngresarDatosRegistro.TELEFONO));
		actor.attemptsTo(Enter.theValue("9876123").into(IngresarDatosRegistro.PASSWORD));
		actor.attemptsTo(Enter.theValue("9876123").into(IngresarDatosRegistro.CONFIRM));
		actor.attemptsTo(Click.on(IngresarDatosRegistro.SUSCRIBIRSE));
		actor.attemptsTo(Click.on(IngresarDatosRegistro.POLITICAS));
		
	}

	public static IngresarDatosRegistroTarea datos() {
		return instrumented(IngresarDatosRegistroTarea.class);
	}

}
