Feature: Validar error al cargar documento que excede el tamaño máximo permitido

  Scenario: Cargar archivo grande
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona un archivo con tamaño superior al límite
    Then el sistema debe validar el tamaño del archivo
    And el sistema muestra el mensaje de 'Tamaño de archivo excedido'