Feature: Date picking action

  @date-picker
  Scenario: date-picker actions
    Given Navigate to "date-picker" page
    When click date-picker box
    And select any date data as "December" "1984" "8"
    Then verify selected correct date data