package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;
    private By searchNameField = By.id("searchName");
    private By searchDateField = By.id("searchDate");
    private By searchTagsField = By.id("searchTags");
    private By searchButton = By.id("searchButton");
    private By searchResults = By.id("searchResults");
    private By detailedView = By.id("detailedView");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSearchPage() {
        driver.get("https://example.com/advanced-search");
    }

    public void enterSearchCriteria(String name, String date, String tags) {
        driver.findElement(searchNameField).sendKeys(name);
        driver.findElement(searchDateField).sendKeys(date);
        driver.findElement(searchTagsField).sendKeys(tags);
    }

    public void submitSearch() {
        driver.findElement(searchButton).click();
    }

    public boolean isSearchResultDisplayed() {
        return driver.findElements(searchResults).size() > 0;
    }

    public void selectSearchResult() {
        driver.findElement(searchResults).click();
    }

    public boolean isDetailViewDisplayed() {
        return driver.findElement(detailedView).isDisplayed();
    }
}