Feature: Animals under health examination should not be fed

  Scenario: Animal under health examination stays hungry
    Given an empty zoo
    And I adopt a monkey named "George"
    And the monkey "George" is under health examination
    And the inventory has 1 FRUITS item
    When I open the zoo
    And I feed the animals
    Then the animal "George" should be hungry
