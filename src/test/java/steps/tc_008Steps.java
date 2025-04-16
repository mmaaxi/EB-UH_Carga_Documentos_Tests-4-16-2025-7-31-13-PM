package steps;

import pages.tc_008Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("El usuario está autenticado en el sistema sin permisos para documentos sensibles")
    public void elUsuarioEstaAutenticadoSinPermisos() {
        page.logIn("usuarioSinPermisos", "contrasena123");
    }

    @When("El usuario intenta visualizar un documento marcado como sensible")
    public void elUsuarioIntentaVisuarlizarDocumentoSensible() {
        page.tryToAccessSensitiveDocument();
    }

    @Then("El sistema limita el acceso a documentos sensibles")
    public void elSistemaLimitaElAcceso() {
        assertFalse(page.isAccessGranted());
    }

    @Then("Aparece un mensaje de 'Acceso Denegado'")
    public void apareceUnMensajeDeAccesoDenegado() {
        assertEquals("Acceso Denegado", page.getAccessDeniedMessage());
    }
}