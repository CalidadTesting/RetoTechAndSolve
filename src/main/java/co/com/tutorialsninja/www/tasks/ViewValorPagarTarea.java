package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.SeleccionarValorPagar;
import co.com.tutorialsninja.www.userinterfases.ViewValorPagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class ViewValorPagarTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ViewValorPagar.VIEW_VALOR));
		
	}
	
	public static ViewValorPagarTarea valor() {
		return instrumented(ViewValorPagarTarea.class);
	}

}
