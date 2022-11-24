package com.co.solucion.stepsdefinitions;

import com.co.prueba.abitlities.NavegarAbilitie;
import com.co.prueba.utils.Utilidades;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SolucionStepDefinition {

    @Managed
    WebDriver Navegador;

    @Before
    public void setUp(){
        NavegarAbilitie.Navegar(Navegador);
    }

    @Given("^que el equipo desea ingresar a la pagina web$")
    public void queElEquipoDeseaIngresarALaPaginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Utilidades.utils().getUrl()));
    }

    @When("^realizamos cada una de las pruebas requeridas$")
    public void realizamosCadaUnaDeLasPruebasRequeridas() {

    }

    @Then("^todo debería ser exitoso$")
    public void todoDeberíaSerExitoso() {
    }
}
