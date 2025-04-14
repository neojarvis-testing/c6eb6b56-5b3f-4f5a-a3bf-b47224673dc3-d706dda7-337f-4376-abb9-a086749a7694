Feature: AvonCycles Selection Submit Contact & Message Form

    
    @a1
    Scenario: Manage Cycle Selection and Checkout
    Given the user hovers on Cycle's by brand and clicks on Avon
    When the user sorts by Price ascending and compares and deletes item
    Then the user proceeds to checkout

    @a2
    Scenario Outline: Fill and Submit Contact & Message Form
    Given the user navigates to the International Business section
    When the user fills  out the form fields with "<email>" and  "<phone>" and "<country>" and  "<compamy>" and "<address>" and "<subject>" and "<message>"

    Examples:
       | email | phone  | country| company | address | subject | message |
       | demo@email.com  | 9876543210  | Country   | Company  | Address | Subject  | Message  |

