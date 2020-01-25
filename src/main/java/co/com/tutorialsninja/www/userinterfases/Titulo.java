package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Titulo {

	public static final Target TITULO_PAGINA = Target.the("En este campo muestra titulo pagina ").located(By.xpath("//a[contains(text(),'The Ninja Store')]"));
	
}
