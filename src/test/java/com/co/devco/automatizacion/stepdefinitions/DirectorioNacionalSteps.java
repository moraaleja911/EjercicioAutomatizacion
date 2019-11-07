package com.co.devco.automatizacion.stepdefinitions;

import com.co.devco.automatizacion.page.DirectorioNacionalPage;
import com.co.devco.automatizacion.page.RamaJudicialInicioPage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.co.devco.automatizacion.page.DirectorioNacionalPage.*;
import static com.co.devco.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_DIRECTORIO_NACIONAL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class DirectorioNacionalSteps {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que \"(.*)\" esta consultando despachos de jurisdiccion disciplinaria")
    public void consultarDirectorioNacional(String actor) {
        theActorCalled(actor).attemptsTo(Open.browserOn().the(RamaJudicialInicioPage.class),
                Scroll.to(BTN_CONSULTAR_DIRECTORIO_NACIONAL).andAlignToBottom(),
                Click.on(BTN_CONSULTAR_DIRECTORIO_NACIONAL)

        );
    }
    @Cuando("selecciona Departamento \"(.*)\", Ciudad \"(.*)\" y Jurisdiccion \"(.*)\"")
    public void seleccionaDepartamentoCiudadJurisdiccion(String departamento, String ciudad, String jurisdiccion) {
        theActorInTheSpotlight().attemptsTo(//Open.browserOn().the(DirectorioNacionalPage.class),
                //SelectFromOptions.byVisibleText(departamento).from(SEL_DEPARTAMENTO),
                //SelectFromOptions.byVisibleText(ciudad).from(SEL_CIUDAD)//,
                //SelectFromOptions.byVisibleText(jurisdiccion).from(SEL_JURISDICCION)

                //se escribe la palabra y se da enter
                Enter.theValue(departamento).into(SEL_DEPARTAMENTO).thenHit(Keys.TAB),
                WaitUntil.the(SEL_DEPARTAMENTO,isClickable()),
                Enter.theValue(ciudad).into(SEL_CIUDAD).thenHit(Keys.TAB),
                Enter.theValue(jurisdiccion).into(SEL_JURISDICCION).thenHit(Keys.TAB)

        );
    }

    @Entonces("debe poder mostrar la busqueda")
    public void MostrarDespachos() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
