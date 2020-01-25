package co.com.tutorialsninja.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

//import co.com.tutorialsninja.www.userinterfases.SegundoBotonContinuar;
import co.com.tutorialsninja.www.userinterfases.Titulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class TituloTarea implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(Titulo.TITULO_PAGINA));
		
	}
	
	public static TituloTarea segundo() {
		return instrumented(TituloTarea.class);
	}
	

}
