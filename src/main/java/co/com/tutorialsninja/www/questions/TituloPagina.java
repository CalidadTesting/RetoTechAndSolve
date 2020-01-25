package co.com.tutorialsninja.www.questions;

import co.com.tutorialsninja.www.userinterfases.Titulo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TituloPagina implements Question <String>  {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(Titulo.TITULO_PAGINA).viewedBy(actor).asString();
		return Texto;
	}

	public static TituloPagina titulo() {
		return new TituloPagina();
			
	}
	
}
