Feature: Advanced Document Search

  Scenario: Validate advanced search of documents
    Given I am on the advanced search page
    When I enter search criteria such as name, date, and tags
    And I submit the search
    Then I should see relevant filtered results
    When I select a result from the search
    Then I should see the detailed view of the document