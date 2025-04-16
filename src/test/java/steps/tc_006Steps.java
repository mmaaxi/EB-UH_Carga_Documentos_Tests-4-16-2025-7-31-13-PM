package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {
    tc_006Page deletedDocsPage = new tc_006Page();

    @Given("el usuario está autenticado y navega a la sección de documentos eliminados")
    public void ingresarSeccionDocumentosEliminados() {
        deletedDocsPage.navigateToDeletedDocumentsSection();
        Assert.assertTrue(deletedDocsPage.isDeletedDocumentsListDisplayed());
    }

    @When("el usuario selecciona un documento eliminado")
    public void seleccionarDocumentoEliminado() {
        deletedDocsPage.selectDeletedDocument();
        Assert.assertTrue(deletedDocsPage.isDocumentDetailsDisplayed());
    }

    @When("el usuario hace clic en el botón 'Recuperar'")
    public void clickBotonRecuperar() {
        deletedDocsPage.clickRecoverButton();
    }

    @Then("el documento se restaura a la lista principal y se muestra mensaje de éxito")
    public void validarDocumentoRestaurado() {
        Assert.assertTrue(deletedDocsPage.isDocumentRestoredToMainList());
        Assert.assertTrue(deletedDocsPage.isSuccessMessageDisplayed());
    }
}