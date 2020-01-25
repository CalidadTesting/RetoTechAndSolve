package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosRegistro {
	
	public static final Target FIRST_NAME = Target.the("En este campo se ingresa el nombre ").located(By.xpath("//input[@id=\'input-firstname\']"));
	public static final Target LAST_NAME = Target.the("En este campo se ingresa el apellido ").located(By.xpath("//input[@id=\'input-lastname\']"));
	public static final Target EMAIL = Target.the("En este campo se ingresa el email ").located(By.xpath("//input[@id=\'input-email\']"));
	public static final Target TELEFONO = Target.the("En este campo se ingresa el telefono ").located(By.xpath("//input[@id=\'input-telephone\']"));
	public static final Target PASSWORD = Target.the("En este campo se ingresa el password ").located(By.xpath("//input[@id=\'input-password\']"));
	public static final Target CONFIRM = Target.the("En este campo se ingresa confirmar password ").located(By.xpath("//input[@id=\'input-confirm\']"));
	public static final Target SUSCRIBIRSE = Target.the("En este campo se ingresa a la suscripcion ").located(By.xpath("//div[@class='form-group']//div[@class='col-sm-10']//label[1]"));
	public static final Target POLITICAS = Target.the("En este campo se ingresa confirmar politicas ").located(By.xpath("//input[@name=\'agree\']"));

}
