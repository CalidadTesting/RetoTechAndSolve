package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarDatosRegistro;
import co.com.tutorialsninja.www.userinterfases.IngresarUsuarioContraseņa;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarUsuarioContraseņaTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IngresarUsuarioContraseņa.BOTON_LOGIN_SUPERIOR));
		actor.attemptsTo(Enter.theValue("pe@pepe10.com").into(IngresarUsuarioContraseņa.INGRESO_EMAIL));
		actor.attemptsTo(Enter.theValue("9876123").into(IngresarUsuarioContraseņa.INGRESO_PASS));
		actor.attemptsTo(Click.on(IngresarUsuarioContraseņa.INGRESO_LOGIN));
		
		
		
	}

	public static IngresarUsuarioContraseņaTarea contraseņa() {
		return instrumented(IngresarUsuarioContraseņaTarea.class);
	}

}
