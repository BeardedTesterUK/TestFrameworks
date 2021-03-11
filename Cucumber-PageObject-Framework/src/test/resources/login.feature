Feature: Authentication

  Scenario: Successfully logging in
    Given the home page
    When logging in as an admin
    Then the home page navigation is available

  Scenario: Successfully using Frame
    Given the home page
    When Input into frame
    Then Text input is correct