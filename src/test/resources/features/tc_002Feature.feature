Feature: Validar error al cargar documento con formato no permitido

  Scenario: El sistema rechaza un archivo de formato no permitido
    Given el usuario se encuentra en la página de carga de documentos
    When selecciona un archivo con formato no permitido
    Then el sistema rechaza el archivo y muestra un mensaje de error

  Scenario: Bloqueo de carga de documento con formato no permitido
    Given el usuario ha seleccionado un archivo de formato no permitido
    When intenta cargar el documento
    Then la carga es bloqueada y se registra el error