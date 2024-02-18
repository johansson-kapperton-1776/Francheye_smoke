@smoke
Feature: Test for creating brand account on fracheye website

  Scenario: Check if brand account is functional
    Given that I am on francheye.com and want to create a brand account
    When I click join button for brand
    And I click brand button
    Then user is re-directed to brand sign up page
    And I enter the brand name
    And I enter my brand email "wfj4fxodi0@secretmail.net"
    And I create my brand password "Redskin01"
    And I confirm my brand password
    And I click brand sign up
    Then I am re-directed to the email confirmation page
    And a code is sent to my email
    Then I am re-directed to onboarding page and first question of brand query appears
    And I enter my company website
    And I enter my social media links
    And I answer the company details questions
    And I select what industry I am in
    And I answer what I am looking to partner on
    Then I am re-directed to my account dashboard

