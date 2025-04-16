package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_001Page;

import static org.junit.Assert.assertTrue;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_001Page.class);
    }

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navigateToUploadPage();
    }

    @When("selecciona un archivo con un formato permitido")
    public void selecciona_un_archivo_con_un_formato_permitido() {
        page.selectFile("documento_permitido.pdf");
    }

    @Then("el nombre del archivo seleccionado es mostrado")
    public void el_nombre_del_archivo_seleccionado_es_mostrado() {
        assertTrue(page.isFileNameDisplayed("documento_permitido.pdf"));
    }

    @When("hace clic en el botón 'Cargar documento'")
    public void hace_clic_en_el_boton_cargar_documento() {
        page.clickUploadButton();
    }

    @Then("el sistema inicia la carga del documento")
    public void el_sistema_inicia_la_carga_del_documento() {
        assertTrue(page.isUploadInitiated());
    }

    @Then("muestra el mensaje de 'Carga exitosa'")
    public void muestra_el_mensaje_de_carga_exitosa() {
        assertTrue(page.isSuccessMessageDisplayed());
    }

    @Then("el documento se registra en la base de datos")
    public void el_documento_se_registra_en_la_base_de_datos() {
        assertTrue(page.isDocumentRegistered());
    }
}