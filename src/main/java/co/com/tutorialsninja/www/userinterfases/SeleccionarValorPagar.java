package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarValorPagar {
	
	public static final Target VALIDACION_CARRITO = Target.the("En este campo se valida que este en el carrito ").located(By.xpath("//span[@id=\'cart-total\']"));

}
