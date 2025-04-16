package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("que un documento está cargado en la lista")
    public void documento_cargado_en_lista() {
        page.ensureDocumentIsLoaded();
    }

    @When("selecciono un documento")
    public void selecciono_un_documento() {
        page.selectDocument();
        Assert.assertTrue(page.isDocumentHighlighted());
    }

    @When("hago clic en el botón 'Eliminar'")
    public void clic_boton_eliminar() {
        page.clickDeleteButton();
        Assert.assertTrue(page.isDeleteConfirmationDisplayed());
    }

    @When("confirmo la eliminación")
    public void confirmo_la_eliminacion() {
        page.confirmDeletion();
    }

    @Then("el documento desaparece de la lista")
    public void documento_desaparece_de_lista() {
        Assert.assertFalse(page.isDocumentInList());
    }

    @Then("veo un mensaje de 'Eliminación exitosa'")
    public void veo_mensaje_eliminacion_exitosa() {
        Assert.assertTrue(page.isSuccessMessageDisplayed());
    }
}