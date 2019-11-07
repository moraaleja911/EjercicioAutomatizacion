package com.co.devco.automatizacion.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://190.217.24.164/Sierju-Web/app/consultaExternaDespachos-flow")
public class DirectorioNacionalPage extends PageObject {
    public static final Target SEL_DEPARTAMENTO=Target.the("Select Box de departamento").located(By.xpath("//*[@id=\"formConsultaExterna:inputDepartamentos_input\"]"));
    public static final Target SEL_CIUDAD=Target.the("Select Box de ciudad").located(By.xpath("//*[@id=\"formConsultaExterna:inputMunicipios_input\"]"));
    public static final Target SEL_JURISDICCION = Target.the("Select Box jurisdiccion").located(By.id("inputJurisdicciones_input"));
    public static final Target BTN_BUSCAR = Target.the("Boton buscar").located(By.xpath("//*[@id=\"formConsultaExterna:j_idt54\"]/span[2]"));
}
