package com.co.prueba.tasks;

import com.co.prueba.models.Models;
import com.co.prueba.userinterfaces.SolucionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresoDeTextoTask implements Task {
    Models datos;

    public IngresoDeTextoTask(Models datos) {
        this.datos = datos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.getEntrada_detexto()).into(SolucionPage.TXT_INPUT));
        actor.attemptsTo(Enter.theValue(datos.getContrasena()).into(SolucionPage.TXT_PASSWORD));
        actor.attemptsTo(Enter.theValue(datos.getTarea()).into(SolucionPage.TXT_TAREA));
        actor.attemptsTo(Enter.theValue("San Francisco").into(SolucionPage.TXT_DROPDOWN_DATALIST));
        actor.attemptsTo(Enter.theValue("24/11/2022").into(SolucionPage.TXT_DATE_PICKER));
    }

    public static IngresoDeTextoTask ingresos(Models datos){
        return Tasks.instrumented(IngresoDeTextoTask.class,datos);
    }
}
