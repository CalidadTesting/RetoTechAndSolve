package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class ViewValorPagar {
	
	public static final Target VIEW_VALOR = Target.the("En este campo se ve el valor que se debe pagar ").located(By.xpath("//tr[2]//td[2]"));

}
