package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.tutorialsninja.www.userinterfases.SeleccionarLinkCamara;
//import co.com.tutorialsninja.www.userinterfases.SeleccionarViewCart;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarLinkCamaraTarea implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SeleccionarLinkCamara.LINK_CAMARA));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
				
	}
	
	
	public static SeleccionarLinkCamaraTarea linkcamara() {
		return instrumented(SeleccionarLinkCamaraTarea.class);
	}
	
	

}
