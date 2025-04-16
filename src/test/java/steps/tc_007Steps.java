package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.tc_007Page;
import static org.junit.Assert.*;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page searchPage = new tc_007Page(driver);

    @Given("I am on the advanced search page")
    public void i_am_on_the_advanced_search_page() {
        searchPage.navigateToSearchPage();
    }

    @When("I enter search criteria such as name, date, and tags")
    public void i_enter_search_criteria() {
        searchPage.enterSearchCriteria("Document Name", "2023-10-24", "tag1, tag2");
    }

    @And("I submit the search")
    public void i_submit_the_search() {
        searchPage.submitSearch();
    }

    @Then("I should see relevant filtered results")
    public void i_should_see_relevant_filtered_results() {
        assertTrue(searchPage.isSearchResultDisplayed());
    }
    
    @When("I select a result from the search")
    public void i_select_a_result_from_the_search() {
        searchPage.selectSearchResult();
    }

    @Then("I should see the detailed view of the document")
    public void i_should_see_the_detailed_view_of_the_document() {
        assertTrue(searchPage.isDetailViewDisplayed());
    }
}