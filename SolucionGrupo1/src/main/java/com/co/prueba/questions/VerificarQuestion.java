package com.co.prueba.questions;

import com.co.prueba.userinterfaces.SolucionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(SolucionPage.TXT_ASERCION).viewedBy(actor).asString();
    }

    public static  VerificarQuestion verificar(){
        return new VerificarQuestion();
    }
}
