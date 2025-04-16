package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadDocument(String filePath) {
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
    }

    public void selectModule(String moduleName) {
        driver.findElement(By.id("module-select")).click();
        driver.findElement(By.xpath("//option[text()='" + moduleName + "']")).click();
    }

    public void submitUpload() {
        driver.findElement(By.id("upload-submit")).click();
    }

    public void verifyDocumentAssociation() {
        String confirmationMessage = driver.findElement(By.id("upload-confirmation")).getText();
        assert confirmationMessage.contains("Document associated with the Project Management module");
    }

    public void verifyDocumentListingWithMetadata() {
        boolean isDocumentListed = driver.findElement(By.xpath("//div[contains(text(), 'DocumentName')]")).isDisplayed();
        assert isDocumentListed;
        
        String metadata = driver.findElement(By.id("document-metadata")).getText();
        assert metadata.contains("Expected Metadata");
    }
}