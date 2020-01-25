package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.google.www.userinterfases.ValorTotalPagar;
import co.com.tutorialsninja.www.userinterfases.Bienvenidad;
//import co.com.google.www.tasks.ValorTotalPagarTarea;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class BienvenidadTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Bienvenidad.BIENVENIDO));
		
	}
	
public static BienvenidadTarea compararsalida() {
		
		return instrumented(BienvenidadTarea.class);
	}

}
