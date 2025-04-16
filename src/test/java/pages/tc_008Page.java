package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_008Page {
    WebDriver driver;

    public tc_008Page() {
        // Inicializa el WebDriver (se puede configurar su inicialización en otro lugar según las buenas prácticas)
        driver = new ChromeDriver();
    }

    public void logIn(String username, String password) {
        driver.get("http://sistema-ejemplo.com/login");
        WebElement userField = driver.findElement(By.id("user"));
        WebElement passField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        userField.sendKeys(username);
        passField.sendKeys(password);
        loginButton.click();
    }

    public void tryToAccessSensitiveDocument() {
        WebElement sensitiveDocumentLink = driver.findElement(By.id("sensitiveDocument"));
        sensitiveDocumentLink.click();
    }

    public boolean isAccessGranted() {
        // Verifica si el acceso ha sido concedido o no
        return !driver.getPageSource().contains("Acceso Denegado");
    }

    public String getAccessDeniedMessage() {
        WebElement message = driver.findElement(By.id("accessDeniedMessage"));
        return message.getText();
    }
}