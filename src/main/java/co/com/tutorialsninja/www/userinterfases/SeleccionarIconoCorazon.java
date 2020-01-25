package co.com.tutorialsninja.www.userinterfases;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarIconoCorazon {
	
	public static final Target ICONO_CORAZON = Target.the("En este campo es el icono del corazon ").located(By.xpath("//div[@id=\'content\']//div[1]//div[1]//div[2]//div[2]//button[2]//i[1]"));

}
