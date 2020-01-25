package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class UltimoValor {
	
	//public static final Target PRECIO_COMPRA_FINAL = Target.the("En este campo se valida que este en el carrito ").located(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[6]"));
	public static final Target PRECIO_COMPRA_FINAL = Target.the("En este campo se valida que este en el carrito ").located(By.xpath("//body//tbody//td[6]"));
}
