package com.co.solucion.stepsdefinitions;

import com.co.prueba.abitlities.NavegarAbilitie;
import com.co.prueba.models.Models;
import com.co.prueba.questions.VerificarQuestion;
import com.co.prueba.tasks.ClicksTask;
import com.co.prueba.tasks.IngresoDeTextoTask;
import com.co.prueba.tasks.SeleccionesTask;
import com.co.prueba.utils.Utilidades;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

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
    public void realizamosCadaUnaDeLasPruebasRequeridas(List<Models> listaDatos) {
        Models datos = listaDatos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoDeTextoTask.ingresos(datos));
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionesTask.seleccion());
        OnStage.theActorInTheSpotlight().attemptsTo(ClicksTask.clicks());
    }

    @Then("^todo debería ser exitoso$")
    public void todoDeberíaSerExitoso() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarQuestion.verificar()
                , Matchers.equalTo(Utilidades.utils().getComparacion())));
    }
}
