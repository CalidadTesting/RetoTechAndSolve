package co.com.tutorialsninja.www.userinterfases;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class Bienvenidad {
	
	public static final Target BIENVENIDO = Target.the("En este campo muestra mensaje bienvenido ").located(By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]"));
	

}
