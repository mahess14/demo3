Feature: Google Search

  Scenario: Search
    Given launch the chrome browser
    When Enter the url as "https://www.google.co.in"
    Then Enter "Ratan Tata" and click Enter
    And Verify the page title as "Ratan Tata"
    Then close browser
