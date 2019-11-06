package com.co.devco.automatizacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Question.QuestionBuilder;

import static com.co.devco.automatizacion.page.ConsultaProcesosPage.TEXT_BARRA;

public class Texto implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return TEXT_BARRA.resolveFor(actor).getText();
    }
    public static Texto barra(){
        return new Texto();
    }
}
