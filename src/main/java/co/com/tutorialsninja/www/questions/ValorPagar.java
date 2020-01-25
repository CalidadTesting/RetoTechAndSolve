package co.com.tutorialsninja.www.questions;

import co.com.tutorialsninja.www.userinterfases.ViewValorPagar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValorPagar implements Question<String>  {

	@Override
	public String answeredBy(Actor actor) {
		String Texto = Text.of(ViewValorPagar.VIEW_VALOR).viewedBy(actor).asString();
		return Texto;
	}

	public static ValorPagar elvalor() {
		return new ValorPagar();
			
	}
	
}
