Feature: Zoo creation and animal adoption

  Scenario: Creating an empty zoo and adopting a hungry animal
    Given an empty zoo
    And I open the zoo

    When I adopt a lion named "Leo"
    And I adopt a lion named "Sanyi"

    Then the zoo should contain 2 animal
    And the animal "Leo" should be hungry
    And the animal "Sanyi" should be hungry


