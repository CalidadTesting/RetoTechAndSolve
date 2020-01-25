package co.com.tutorialsninja.www.questions;

import co.com.tutorialsninja.www.userinterfases.Bienvenidad;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MensajeBienvenidad implements Question <String>  {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(Bienvenidad.BIENVENIDO).viewedBy(actor).asString();
		return Texto;
	}

	public static MensajeBienvenidad mensaje() {
		return new MensajeBienvenidad();
			
	}
	
}
