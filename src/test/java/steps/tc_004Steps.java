package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;

public class tc_004Steps {

    WebDriver driver;
    tc_004Page page;

    public tc_004Steps() {
        this.driver = Hooks.driver;
        this.page = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("el usuario selecciona un documento en el sistema")
    public void elUsuarioSeleccionaUnDocumentoEnElSistema() {
        page.seleccionarDocumento();
    }
    
    @When("el usuario modifica los metadatos como título, descripción y etiquetas")
    public void elUsuarioModificaLosMetadatos() {
        page.modificarMetadatos("Nuevo Título", "Nueva Descripción", "nueva, etiqueta");
    }
    
    @And("guarda los cambios realizados")
    public void guardaLosCambiosRealizados() {
        page.guardarCambios();
    }
    
    @Then("el sistema debería mostrar los cambios actualizados")
    public void elSistemaMuestraLosCambiosActualizados() {
        page.validarCambiosRealizados();
    }

    @And("debería mostrar un mensaje de \"Actualización exitosa\"")
    public void deberiaMostrarMensajeActualizacionExitosa() {
        page.validarMensajeExitoso();
    }
}