package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarMyAccount {
	
	public static final Target SELECCION_ACCOUNT = Target.the("Este selecciona el campo cuenta").located(By.xpath("//span[contains(text(),'My Account')]"));

}
