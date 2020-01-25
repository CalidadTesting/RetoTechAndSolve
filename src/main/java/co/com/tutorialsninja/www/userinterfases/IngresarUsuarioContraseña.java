package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarUsuarioContraseña {
	
	public static final Target BOTON_LOGIN_SUPERIOR = Target.the("En este campo presionan el boton login superior ").located(By.xpath("//ul[@class=\'dropdown-menu dropdown-menu-right\']//a[contains(text(),'Login')]"));
	public static final Target INGRESO_EMAIL = Target.the("En este campo ingresan el email ").located(By.xpath("//input[@id=\'input-email\']"));
	public static final Target INGRESO_PASS = Target.the("En este campo ingresan el pass ").located(By.xpath("//input[@id=\'input-password\']"));
	public static final Target INGRESO_LOGIN = Target.the("En este campo presionan el boton login ").located(By.xpath("//input[@class=\'btn btn-primary\']"));

}
