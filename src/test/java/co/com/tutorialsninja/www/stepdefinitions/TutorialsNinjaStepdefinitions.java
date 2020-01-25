package co.com.tutorialsninja.www.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.tutorialsninja.www.questions.MensajeBienvenidad;
import co.com.tutorialsninja.www.questions.TituloPagina;
import co.com.tutorialsninja.www.questions.UltimoValorPagar;
import co.com.tutorialsninja.www.questions.ValorPagar;
import co.com.tutorialsninja.www.tasks.AbrirPaginaTutorialsNinjaTarea;
import co.com.tutorialsninja.www.tasks.IngresarDatosRegistroTarea;
import co.com.tutorialsninja.www.tasks.IngresarLoginTarea;
import co.com.tutorialsninja.www.tasks.IngresarUsuarioContraseñaTarea;
import co.com.tutorialsninja.www.tasks.PresionarBotonContinuarTarea;
import co.com.tutorialsninja.www.tasks.SegundoBotonContinuarTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarIconoCorazonTarea;
//import co.com.tutorialsninja.www.tasks.SeleccionarLinkCamaraTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarLinkPhonesTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarMyAccountTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarRegistroTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarUnPhonesTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarValorPagarTarea;
import co.com.tutorialsninja.www.tasks.SeleccionarViewCartTarea;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TutorialsNinjaStepdefinitions {
	
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	
	private Actor automatizador = Actor.named("Automatizador");
	private final String MENSAJE_BIENVENIDAD = "Congratulations! Your new account has been successfully created!";
	private final String TITULO = "The Ninja Store";
	private final String ELVALOR = "$100.00";
	private final String ELULTIMOVALOR = "$100.00";
	
	
	@Before
	public void setUp(){
		automatizador.can(BrowseTheWeb.with(hisBrowser));
	}
	

	@Given("^que ingreso al sitio web$")
	public void queIngresoAlSitioWeb() {
	   automatizador.wasAbleTo(AbrirPaginaTutorialsNinjaTarea.abrirpagina());
	}

	
	@Given("^selecciono my account$")
	public void seleccionoMyAccount() {
		automatizador.wasAbleTo(SeleccionarMyAccountTarea.account());
		automatizador.wasAbleTo(SeleccionarRegistroTarea.registro());
	   
	}

	@When("^ingreso los datos personales$")
	public void ingresoLosDatosPersonales() {
		automatizador.wasAbleTo(IngresarDatosRegistroTarea.datos());
	    
	}

	@When("^presiono continuar$")
	public void presionoContinuar() {
		automatizador.wasAbleTo(PresionarBotonContinuarTarea.continuar());
	    
	}

	@Then("^verifico la creacion del usuario$")
	public void verificoLaCreacionDelUsuario() {
		automatizador.should(seeThat(MensajeBienvenidad.mensaje(),equalTo(MENSAJE_BIENVENIDAD)));
	    
	}

	@Then("^presiono boton continuar$")
	public void presionoBotonContinuar() {
		automatizador.wasAbleTo(SegundoBotonContinuarTarea.segundo());
	   
	}

	@Then("^llega a la pantalla de The Ninja Store$")
	public void llegaALaPantallaDeTheNinjaStore() {
		automatizador.should(seeThat(TituloPagina.titulo(),equalTo(TITULO)));
	   
	}

	@Given("^que ingreso a la pagina web$")
	public void queIngresoALaPaginaWeb() {
		automatizador.wasAbleTo(AbrirPaginaTutorialsNinjaTarea.abrirpagina());
	   
	}

	@Given("^selecciono my account login$")
	public void seleccionoMyAccountLogin() {
		automatizador.wasAbleTo(IngresarLoginTarea.login());
	}

	@Given("^ingreso user y pass$")
	public void ingresoUserYPass() {
		automatizador.wasAbleTo(IngresarUsuarioContraseñaTarea.contraseña());
		
	    
	}

	@When("^selecciono el link de phonesypdas$")
	public void seleccionoElLinkDePhonesypdas() {
		automatizador.wasAbleTo(SeleccionarLinkPhonesTarea.phones());
	   
	}

	@When("^selecciono un phone$")
	public void seleccionoUnPhone() {
		automatizador.wasAbleTo(SeleccionarUnPhonesTarea.pda());
	    
	}

	@Then("^verifico el view cart$")
	public void verificoElViewCart() {
		automatizador.wasAbleTo(SeleccionarValorPagarTarea.valor());
		automatizador.should(seeThat(ValorPagar.elvalor(),equalTo(ELVALOR)));
		automatizador.wasAbleTo(SeleccionarViewCartTarea.view());
		
	    
	}

	@Then("^veo el valor a pagar$")
	public void veoElValorAPagar() {
		automatizador.should(seeThat(UltimoValorPagar.ultimo(),equalTo(ELULTIMOVALOR)));
	    
	}

	@Given("^que ingreso a la pagina$")
	public void queIngresoALaPagina() {
		automatizador.wasAbleTo(AbrirPaginaTutorialsNinjaTarea.abrirpagina());
		automatizador.wasAbleTo(IngresarLoginTarea.login());
		automatizador.wasAbleTo(IngresarUsuarioContraseñaTarea.contraseña());
		automatizador.wasAbleTo(SeleccionarLinkPhonesTarea.phones());
		automatizador.wasAbleTo(SeleccionarUnPhonesTarea.pda());
		automatizador.wasAbleTo(SeleccionarIconoCorazonTarea.corazon());
		//automatizador.wasAbleTo(SeleccionarLinkPhonesTarea.phones());
		//automatizador.wasAbleTo(SeleccionarCamaraTarea.camara());
		
	    
	}

	@When("^selecciono el link de camaras$")
	public void seleccionoElLinkDeCamaras() {
		//automatizador.wasAbleTo(SeleccionarLinkCamaraTarea.linkcamara());
		
	    
	}

	@When("^selecciono una camara$")
	public void seleccionoUnaCamara() {
	    
	}

	@Then("^presiono corazon$")
	public void presionoCorazon() {
	    
	}

	@Then("^veo el mensaje de wish list$")
	public void veoElMensajeDeWishList() {
	   
	}

	@Given("^que ingreso a la web$")
	public void queIngresoALaWeb() {
	   
	}

	@When("^selecciono el link de wish list$")
	public void seleccionoElLinkDeWishList() {
	    
	}

	@When("^selecciono elemento a borrar$")
	public void seleccionoElementoABorrar() {
	    
	}

	@Then("^presiono la  cruz$")
	public void presionoLaCruz() {
	   
	}

	@Then("^veo el mensaje de eliminado$")
	public void veoElMensajeDeEliminado() {
	    
	}


	
	
	
	

}
