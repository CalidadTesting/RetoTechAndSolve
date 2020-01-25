package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SeleccionarRegistro {
	
	public static final Target SELECCION_REGISTRO = Target.the("Este selecciona el link de registro").located(By.xpath("//a[contains(text(),'Register')]"));

}
