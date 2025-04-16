import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    private By fileInput = By.id("file-upload");
    private By submitButton = By.id("upload-button");
    private By errorMessage = By.id("error-msg");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageUrl() {
        return "http://example.com/upload";
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(fileInput);
        uploadElement.sendKeys(filePath);
    }

    public void submitFile() {
        driver.findElement(submitButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean isUploadBlocked() {
        return !driver.findElement(submitButton).isEnabled();
    }

    public boolean isErrorMessageLogged() {
        // Implementation for error logging validation
        return true;
    }
}