package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;
    
    // Locators
    private By fileInput = By.id("file-upload-input");
    private By uploadButton = By.id("upload-button");
    private By fileNameDisplay = By.id("file-name-display");
    private By successMessage = By.id("success-message");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectFile(String filePath) {
        WebElement inputElement = driver.findElement(fileInput);
        inputElement.sendKeys(filePath);
    }

    public boolean isFileNameDisplayed(String fileName) {
        WebElement fileNameElement = driver.findElement(fileNameDisplay);
        return fileNameElement.getText().equals(fileName);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadInitiated() {
        // Implementation to check if upload has started
        return true; // Example logic placeholder
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isDocumentRegistered() {
        // Mockup or placeholder checking if document is registered in database
        return true; // Example logic placeholder
    }
}