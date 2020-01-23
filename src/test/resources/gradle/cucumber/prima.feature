Feature: Cuanto sera el valor de la prima?
  Se requiere calcular el valor de la prima para los distintos escenarios

  Scenario: Escenario 1
    Given Puntos son 25
    When Edad es 70
    Then Prima es igual a 750.0

  Scenario: Escenario 2
    Given Puntos son 26
    When Edad es 65
    Then Prima es igual a 550.0	