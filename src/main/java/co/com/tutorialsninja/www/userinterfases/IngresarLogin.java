package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarLogin {
	
	public static final Target SELECCION_ACCOUNT = Target.the("Este selecciona el campo cuenta").located(By.xpath("//span[contains(text(),'My Account')]"));
	public static final Target INGRESO_LOGUIN = Target.the("En este ingresa el login de registro ").located(By.xpath("//ul[@class=\'dropdown-menu dropdown-menu-right\']//a[contains(text(),'Login')]"));
	
	

}
