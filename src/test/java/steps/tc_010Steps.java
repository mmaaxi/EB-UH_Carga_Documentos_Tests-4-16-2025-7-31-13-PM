package steps;

import pages.tc_010Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("I have selected multiple documents to upload")
    public void i_have_selected_multiple_documents_to_upload() {
        page.selectMultipleDocuments();
    }

    @When("I start the upload process")
    public void i_start_the_upload_process() {
        page.startUpload();
    }

    @Then("the system should start processing files in parallel")
    public void the_system_should_start_processing_files_in_parallel() {
        assertTrue(page.isProcessingInParallel());
    }

    @Then("it should maintain stability and respond within the established times")
    public void it_should_maintain_stability_and_respond_within_the_established_times() {
        assertTrue(page.isSystemStableAndResponsive());
    }
}