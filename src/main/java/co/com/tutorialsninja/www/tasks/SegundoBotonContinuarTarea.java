package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.SegundoBotonContinuar;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SegundoBotonContinuarTarea implements Task  {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SegundoBotonContinuar.SEGUNDO_BOTON));
		
	}

	public static SegundoBotonContinuarTarea segundo() {
		return instrumented(SegundoBotonContinuarTarea.class);
	}
	
	
	
	
	

}
