package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarLinkCamara {
	
	//public static final Target LINK_CAMARA = Target.the("En este campo es el link de la camara ").located(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a"));
	public static final Target LINK_CAMARA = Target.the("En este campo es el link de la camara ").located(By.xpath("//li[7]//a[1]"));
	
}
