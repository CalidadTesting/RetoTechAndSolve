package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PresionarBotonContinuar {
	
	public static final Target CONTINUE = Target.the("En este campo se presiona el boton continuar ").located(By.xpath("//input[@class=\'btn btn-primary\']"));

}
