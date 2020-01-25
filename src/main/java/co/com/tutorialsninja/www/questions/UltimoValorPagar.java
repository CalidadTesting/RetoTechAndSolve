package co.com.tutorialsninja.www.questions;

import co.com.tutorialsninja.www.userinterfases.UltimoValor;
//import co.com.tutorialsninja.www.userinterfases.ViewValorPagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UltimoValorPagar implements Question<String>  {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(UltimoValor.PRECIO_COMPRA_FINAL).viewedBy(actor).asString();
		return Texto;
	}

	public static UltimoValorPagar ultimo() {
		return new UltimoValorPagar();
			
	}
	
}
