#Author: correa.edison@gmail.com
#languaje:es
Feature: Prueba de automatizacion con Screenplay practica TechAndSolve
	yo deseo realizar parcticas de automatizacion desde la pagina http://tutorialsninja.com/demo
	
 Scenario: Crear un usuario y validar el nombre creado 
	Given que ingreso al sitio web 
	And selecciono my account
	When ingreso los datos personales
	And presiono continuar
	Then verifico la creacion del usuario
	And presiono boton continuar
	And llega a la pantalla de The Ninja Store
	
 Scenario: Loguear un usuario y agregar al carrito de compras 
	Given que ingreso a la pagina web 
	And selecciono my account login
	And ingreso user y pass
	When selecciono el link de phonesypdas
	And selecciono un phone
	Then verifico el view cart 
	And veo el valor a pagar
	
 Scenario: Crear un articulo en wish list y verificar su creacion 
	Given que ingreso a la pagina
	And selecciono my account login
	And ingreso user y pass
	When selecciono el link de camaras
	And selecciono una camara
	Then presiono corazon
	And veo el mensaje de wish list
	
 Scenario: Retirar articulo de wish list y verificar su retiro
	Given que ingreso a la web
	And selecciono my account login
	And ingreso user y pass
	When selecciono el link de wish list
	And selecciono elemento a borrar
	Then presiono la  cruz
	And veo el mensaje de eliminado