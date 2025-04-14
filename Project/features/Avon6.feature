Feature: Avon feature

    @Avon
    Scenario: Avon feature test
    Given User lands on the Avon Cycle Homepage for Avon
    When user scroll down to footer 
    And click cyclux and navigate Back
    And scroll down to footer and click avon
    And verify price filter price
    And click on review filter and first review
    And click on size filter and first size
    And click on color filter and clear filter and select first sort option
    Then click first product and verify addtocart and capture screenshot 