package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_003Page {
    private WebDriver driver;
    private By uploadInput = By.id("fileUpload");
    private By errorMessage = By.id("error-message");

    public tc_003Page() {
        driver = new ChromeDriver();
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectLargeFile() {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys("/path/to/largefile.txt"); // Replace with actual file path
    }
    
    public boolean isFileRejected() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.isDisplayed();
    }

    public String getErrorMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }
}