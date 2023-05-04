Feature: Slider Action

  @slider
  Scenario: Slider actions verifying
    Given Navigate to "slider" page
    When make some slider actions to "increase"
    Then verify slider value "increased"
    When make some slider actions to "decrease"
    Then verify slider value "decreased"
