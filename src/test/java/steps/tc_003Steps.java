package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {
    private tc_003Page page;

    @Given("el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page = new tc_003Page();
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un archivo con tamaño superior al límite")
    public void elUsuarioSeleccionaUnArchivoDelTamañoSuperiorAlLimite() {
        page.selectLargeFile();
    }

    @Then("el sistema debe validar el tamaño del archivo")
    public void elSistemaDebeValidarElTamañoDelArchivo() {
        boolean isFileRejected = page.isFileRejected();
        Assert.assertTrue("El sistema no ha rechazado el archivo grande", isFileRejected);
    }

    @Then("el sistema muestra el mensaje de 'Tamaño de archivo excedido'")
    public void elSistemaMuestraElMensajeDeTamañoDeArchivoExcedido() {
        String errorMessage = page.getErrorMessage();
        Assert.assertEquals("Tamaño de archivo excedido", errorMessage);
    }
}