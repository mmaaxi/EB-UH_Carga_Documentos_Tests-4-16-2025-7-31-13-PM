package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {
    private WebDriver driver;

    // Locators
    private By documentSelector = By.cssSelector(".document-item");
    private By deleteButton = By.id("delete-button");
    private By deleteConfirmationModal = By.id("delete-confirmation");
    private By successMessage = By.id("success-message");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ensureDocumentIsLoaded() {
        // Method to ensure a document is present in the list
    }

    public void selectDocument() {
        driver.findElement(documentSelector).click();
    }

    public boolean isDocumentHighlighted() {
        // Check if document is highlighted
        return driver.findElement(documentSelector).getAttribute("class").contains("highlight");
    }

    public void clickDeleteButton() {
        driver.findElement(deleteButton).click();
    }

    public boolean isDeleteConfirmationDisplayed() {
        return driver.findElement(deleteConfirmationModal).isDisplayed();
    }

    public void confirmDeletion() {
        // Confirm deletion action
        driver.findElement(deleteConfirmationModal).findElement(By.cssSelector(".confirm-button")).click();
    }

    public boolean isDocumentInList() {
        // Verify document is no longer in the list
        return driver.findElements(documentSelector).isEmpty();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }
}