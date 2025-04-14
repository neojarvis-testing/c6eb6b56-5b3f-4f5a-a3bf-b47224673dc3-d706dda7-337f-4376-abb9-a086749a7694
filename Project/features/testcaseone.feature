Feature: Checkout Page

    Scenario: Checkout functionality

    Given user is on the homepage
    When user search for given value
    | Gear |
    Then user will be redirected to Product list Page
    When user click on the first Product
    Then user will be redirected to product Page
    When user will click on the Buy Now button
    Then user will be redirected to checkout Page
    When user fill all the details
    | firstname |
    | Lastname |
    | demo@email.com |
    | 9876543210 |
    | 100001 |
    | State |
    | City |
    | Address |
    | demo |
    And click on Razorpay
    And click on CONFIRM CHECKOUT button
    Then user will redirected to to page having PROCEED TO PAYMENT button