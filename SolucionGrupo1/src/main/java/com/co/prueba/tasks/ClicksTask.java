package com.co.prueba.tasks;

import com.co.prueba.userinterfaces.SolucionPage;
import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.thucydides.core.model.Release;

public class ClicksTask implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SolucionPage.TXT_CHEKED_DEFAUL));
        actor.attemptsTo(Click.on(SolucionPage.TXT_CHEKED_UNO));
        actor.attemptsTo(Click.on(SolucionPage.BTN_RADIO_DEFAUL));
        actor.attemptsTo(Click.on(SolucionPage.BTN_RADIO_BUTON));
        //actor.attemptsTo(Click.on(SolucionPage.TXT_SUBIR_ARCHIVO));
        //actor.attemptsTo(SendKeys.of("src/main/java/com/co/prueba/utils/proyecto.txt").into(SolucionPage.TXT_SUBIR_ARCHIVO));
        actor.attemptsTo(Click.on(SolucionPage.TXT_COLOR));
        String textOnly = String.valueOf(SolucionPage.TXT_READONLY.toString());
        System.out.println(textOnly);
        actor.attemptsTo(Click.on(SolucionPage.BTN_ENVIAR));

    }

    public static ClicksTask clicks(){
        return Tasks.instrumented(ClicksTask.class);
    }


}
