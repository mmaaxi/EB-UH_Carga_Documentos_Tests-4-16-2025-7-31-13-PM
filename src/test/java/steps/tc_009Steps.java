package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_009Page;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page;

    public tc_009Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc_009Page.class);
    }

    @Given("I am on the document upload page")
    public void iAmOnTheDocumentUploadPage() {
        page.navigateToUploadPage();
    }

    @When("I upload a document and select the project management module")
    public void iUploadADocumentAndSelectTheProjectManagementModule() {
        page.uploadDocument("path/to/document");
        page.selectModule("Project Management");
        page.submitUpload();
    }

    @Then("the document should be associated correctly with the selected module")
    public void theDocumentShouldBeAssociatedCorrectlyWithTheSelectedModule() {
        page.verifyDocumentAssociation();
    }

    @Then("the document should be listed in the project management module with correct metadata")
    public void theDocumentShouldBeListedInTheProjectManagementModuleWithCorrectMetadata() {
        page.verifyDocumentListingWithMetadata();
    }
}