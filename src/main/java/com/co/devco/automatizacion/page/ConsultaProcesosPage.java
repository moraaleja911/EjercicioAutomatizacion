package com.co.devco.automatizacion.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://procesos.ramajudicial.gov.co/consultaprocesos/ConsultaJusticias21.aspx")
public class ConsultaProcesosPage extends PageObject {
    public static final Target SEL_CIUDAD=Target.the("Select Box de Ciudad").located(By.id("ddlCiudad"));
    public static final Target SEL_ENTIDAD=Target.the("Select Box de Entidad").located(By.id("ddlEntidadEspecialidad"));
    public static final Target SEL_NRO_RADICADO = Target.the("Input radicado").located(By.xpath("//input[@onkeypress=\" return num(event)\"]"));
    public static final Target TEXT_BARRA = Target.the("Text barra").located(By.id("ConsultarNum"));
}
