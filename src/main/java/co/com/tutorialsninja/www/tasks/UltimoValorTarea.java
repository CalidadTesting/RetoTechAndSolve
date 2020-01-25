package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.IngresarUsuarioContraseña;
import co.com.tutorialsninja.www.userinterfases.UltimoValor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class UltimoValorTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(UltimoValor.PRECIO_COMPRA_FINAL));
		
	}

	public static UltimoValorTarea contraseña() {
		return instrumented(UltimoValorTarea.class);
	}
	
}
