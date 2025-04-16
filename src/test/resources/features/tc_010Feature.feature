Feature: Validate the performance on bulk document upload

  Scenario: Upload multiple documents simultaneously
    Given I have selected multiple documents to upload
    When I start the upload process
    Then the system should start processing files in parallel
    And it should maintain stability and respond within the established times