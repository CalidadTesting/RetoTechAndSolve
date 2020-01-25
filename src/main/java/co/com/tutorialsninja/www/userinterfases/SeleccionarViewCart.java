package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class SeleccionarViewCart {

	//public static final Target BOTON_VIEW_CART = Target.the("En este campo se presiona el View Cart ").located(By.xpath("//strong[contains(text(),'View Cart')]"));
	public static final Target BOTON_VIEW_CART = Target.the("En este campo se presiona el View Cart ").located(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong"));
}
