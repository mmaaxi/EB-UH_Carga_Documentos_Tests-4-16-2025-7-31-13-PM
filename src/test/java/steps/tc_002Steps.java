import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page page;

    @Given("el usuario se encuentra en la página de carga de documentos")
    public void el_usuario_se_encuentra_en_la_pagina_de_carga_de_documentos() {
        page = new tc_002Page(driver);
        driver.get(page.getPageUrl());
    }

    @When("selecciona un archivo con formato no permitido")
    public void selecciona_un_archivo_con_formato_no_permitido() {
        page.uploadFile("path/to/invalid/file.exe");
    }

    @Then("el sistema rechaza el archivo y muestra un mensaje de error")
    public void el_sistema_rechaza_el_archivo_y_muestra_un_mensaje_de_error() {
        assert page.isErrorMessageDisplayed();
    }

    @Given("el usuario ha seleccionado un archivo de formato no permitido")
    public void el_usuario_ha_seleccionado_un_archivo_de_formato_no_permitido() {
        page.uploadFile("path/to/invalid/file.exe");
    }

    @When("intenta cargar el documento")
    public void intenta_cargar_el_documento() {
        page.submitFile();
    }

    @Then("la carga es bloqueada y se registra el error")
    public void la_carga_es_bloqueada_y_se_registra_el_error() {
        assert page.isUploadBlocked();
        assert page.isErrorMessageLogged();
    }
}