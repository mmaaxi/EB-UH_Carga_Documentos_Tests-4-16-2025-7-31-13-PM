package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_004Page {

    WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "documentSelector")
    WebElement documento;

    @FindBy(id = "title")
    WebElement titleField;

    @FindBy(id = "description")
    WebElement descriptionField;

    @FindBy(id = "tags")
    WebElement tagsField;

    @FindBy(id = "saveButton")
    WebElement saveButton;

    @FindBy(id = "successMessage")
    WebElement successMessage;

    public void seleccionarDocumento() {
        documento.click();
    }

    public void modificarMetadatos(String titulo, String descripcion, String etiquetas) {
        titleField.clear();
        titleField.sendKeys(titulo);
        descriptionField.clear();
        descriptionField.sendKeys(descripcion);
        tagsField.clear();
        tagsField.sendKeys(etiquetas);
    }

    public void guardarCambios() {
        saveButton.click();
    }

    public void validarCambiosRealizados() {
        // Validación específica que debe ser personalizada
        // para verificar los metadatos actualizados
    }

    public void validarMensajeExitoso() {
        // Aquí se debería hacer una aserción para comprobar que 
        // successMessage es visible y contiene "Actualización exitosa"
    }
}