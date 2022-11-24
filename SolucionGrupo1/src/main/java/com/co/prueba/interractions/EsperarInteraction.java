package com.co.prueba.interractions;

import com.co.prueba.exceptions.EsperarException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class EsperarInteraction implements Interaction {
    int espera;

    public EsperarInteraction(int espera) {
        this.espera = espera;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        EsperarException.esperarError(espera);
    }

    public static EsperarInteraction esperar(int espera){
        return new EsperarInteraction(espera);
    }

}
