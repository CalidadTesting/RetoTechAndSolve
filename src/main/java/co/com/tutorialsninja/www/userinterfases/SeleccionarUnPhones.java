package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarUnPhones {
	
	public static final Target SELECCION_IPHONE = Target.the("En este campo se selecciona un iphone ").located(By.xpath("//div[@id=\'content\']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]"));

}
