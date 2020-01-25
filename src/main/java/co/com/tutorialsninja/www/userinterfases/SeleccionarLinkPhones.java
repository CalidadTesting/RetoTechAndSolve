package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarLinkPhones {
	
	public static final Target SECCION_LINK_PHONES = Target.the("En este se selecciona link de Phones  ").located(By.xpath("//a[contains(text(),'Phones & PDAs')]"));

}
