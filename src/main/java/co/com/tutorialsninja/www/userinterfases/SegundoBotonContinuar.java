package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SegundoBotonContinuar {
	
	public static final Target SEGUNDO_BOTON = Target.the("En este campo se presiona el segundo boton continuar ").located(By.xpath("//a[@class=\'btn btn-primary\']"));

}
