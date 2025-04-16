Feature: Validate integration with other modules when uploading documents

  Scenario: Validate document association and access in the project management module
    Given I am on the document upload page
    When I upload a document and select the project management module
    Then the document should be associated correctly with the selected module
    And the document should be listed in the project management module with correct metadata