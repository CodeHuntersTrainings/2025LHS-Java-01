Feature: Feeding animals

  Scenario: Feeding a hungry lion
    Given an empty zoo
    And I adopt a lion named "Leo"
    And the inventory has 1 MEAT item
    When I open the zoo
    And I feed the animals
    Then the animal "Leo" should not be hungry
