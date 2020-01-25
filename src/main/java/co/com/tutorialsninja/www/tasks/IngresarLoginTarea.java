package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarLogin;
//import co.com.tutorialsninja.www.userinterfases.SegundoBotonContinuar;
import co.com.tutorialsninja.www.userinterfases.SeleccionarMyAccount;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarLoginTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarMyAccount.SELECCION_ACCOUNT));
		//actor.attemptsTo(Click.on(IngresarLogin.INGRESO_LOGUIN));
		//actor.attemptsTo(Click.on(IngresarLogin.INGRESO_LOGUIN));
		
	}

	public static IngresarLoginTarea login() {
		return instrumented(IngresarLoginTarea.class);
	}
	
	

}
