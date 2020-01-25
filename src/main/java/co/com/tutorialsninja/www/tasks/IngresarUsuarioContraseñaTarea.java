package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarDatosRegistro;
import co.com.tutorialsninja.www.userinterfases.IngresarUsuarioContrase�a;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarUsuarioContrase�aTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(IngresarUsuarioContrase�a.BOTON_LOGIN_SUPERIOR));
		actor.attemptsTo(Enter.theValue("pe@pepe10.com").into(IngresarUsuarioContrase�a.INGRESO_EMAIL));
		actor.attemptsTo(Enter.theValue("9876123").into(IngresarUsuarioContrase�a.INGRESO_PASS));
		actor.attemptsTo(Click.on(IngresarUsuarioContrase�a.INGRESO_LOGIN));
		
		
		
	}

	public static IngresarUsuarioContrase�aTarea contrase�a() {
		return instrumented(IngresarUsuarioContrase�aTarea.class);
	}

}
