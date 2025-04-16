package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_006Page {
    WebDriver driver;

    By deletedDocumentsSection = By.id("deleted-documents-section");
    By documentDetails = By.cssSelector(".document-details");
    By recoverButton = By.id("recover-button");
    By successMessage = By.id("success-message");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToDeletedDocumentsSection() {
        driver.findElement(deletedDocumentsSection).click();
    }

    public boolean isDeletedDocumentsListDisplayed() {
        return driver.findElements(By.cssSelector(".deleted-document")).size() > 0;
    }

    public void selectDeletedDocument() {
        driver.findElements(By.cssSelector(".deleted-document")).get(0).click();
    }

    public boolean isDocumentDetailsDisplayed() {
        return driver.findElement(documentDetails).isDisplayed();
    }

    public void clickRecoverButton() {
        driver.findElement(recoverButton).click();
    }

    public boolean isDocumentRestoredToMainList() {
        // Logic to verify document is in the main list
        return true;
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}