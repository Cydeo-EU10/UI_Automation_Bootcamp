Feature:

  @auto-complete
  Scenario: verify select multiple color names
    Given Navigate to "auto-complete" page
    When input "w" letter multiple select textbox
    Then verify you select color about this letter
    And delete color which selected
    Then verify you delete


#  Scenario Outline: verify select multiple color names