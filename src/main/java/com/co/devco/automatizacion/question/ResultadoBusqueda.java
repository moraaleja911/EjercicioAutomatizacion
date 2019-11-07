package com.co.devco.automatizacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Question.QuestionBuilder;

import static com.co.devco.automatizacion.page.DirectorioNacionalPage.RESULTADOS;

public class ResultadoBusqueda implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return RESULTADOS.resolveFor(actor).getText();
    }
    public static ResultadoBusqueda resultado(){
        return new ResultadoBusqueda();
    }
}
