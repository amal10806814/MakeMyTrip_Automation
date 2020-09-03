@Hello
Feature: amazon login

  Scenario: login amazon

    Given  launch amazon url
    And  enter credential
    Then verify the homepage