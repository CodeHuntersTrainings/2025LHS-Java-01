Feature: Feeding different animals

  Scenario Outline: Feed a hungry animal with appropriate food
    Given an empty zoo
    When I adopt a <animalType> named "<name>"
    And the inventory has <foodAmount> <foodType> item
    And I open the zoo
    And I feed the animals
    Then the animal "<name>" should not be hungry

    Examples:
      | animalType | name   | foodType | foodAmount |
      | lion       | Leo    | MEAT     | 1          |
      | elephant   | Ellie  | PLANTS   | 1          |
      | monkey     | George | FRUITS   | 1          |