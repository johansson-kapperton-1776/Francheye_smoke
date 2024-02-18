@smoke
Feature: Test for creating creator account on fracheye website

  Scenario: Check if creator account is functional
    Given that I am on francheye.com and want to create a creator account
    When I click join button
    And I click creator button
    Then user is re-directed to creater sign up page
    And I enter my name
    And I enter my email
    And I create my password
    And I confirm my password
    And I click sign up
    Then I am re-directed to the email confirmation page and a code is sent to my email
    Then I am re-directed to onboarding page and first question of query appears
    And I select the region I live in
    And I select the creator niche
    And I select what I am looking to partner on
    And I connect my socials
    And I click next
    Then I am redirected to my account dashboard


