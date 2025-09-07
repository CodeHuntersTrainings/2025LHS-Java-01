Feature: Zoo creation and animal adoption

  Scenario: Creating an empty zoo and adopting a hungry animal
    Given an empty zoo
    When I adopt a lion named "Leo"
    Then the zoo should contain 1 animal
    And the animal "Leo" should be hungry
