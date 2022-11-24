package com.co.prueba.tasks;

import com.co.prueba.userinterfaces.SolucionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;

import javax.management.ObjectName;

public class SeleccionesTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue("2").from(SolucionPage.TXT_DROPDOWN));
    }

    public static SeleccionesTask seleccion(){
        return Tasks.instrumented(SeleccionesTask.class);
    }
}
