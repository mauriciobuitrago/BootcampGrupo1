package com.co.prueba.abitlities;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class NavegarAbilitie {

    WebDriver navegador;

    public NavegarAbilitie(WebDriver navegador) {
        this.navegador = navegador;
        navegador();
    }

    private void navegador() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Equipo1");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }

    public static NavegarAbilitie Navegar(WebDriver navegador){
        return new NavegarAbilitie(navegador);
    }
}
